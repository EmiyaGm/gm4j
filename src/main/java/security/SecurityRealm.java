package security;

import entity.e_permission;
import entity.e_role;
import entity.e_user;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;
import service.is_permission;
import service.is_role;
import service.is_user;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户身份验证，授权Realm组件
 * Created by gm on 17/1/6.
 */
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm{

    @Resource
    private is_user isUser;

    @Resource
    private is_role isRole;

    @Resource
    private is_permission isPermission;


    /**
     * 权限检查
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authentizationInfo = new SimpleAuthorizationInfo();
        String username = String.valueOf((principalCollection.getPrimaryPrincipal()));
        final e_user user = isUser.getByUsername(username);
        final List<e_role> roleInfos = isRole.getByUserid(user.getId());
        for(e_role role : roleInfos){
            //添加角色
            System.err.println(role);
            authentizationInfo.addRole(role.getRoleSign());
            final List<e_permission> permissions = isPermission.getByRoleid(role.getId());
            for(e_permission permission : permissions){
                //添加权限
                System.err.println(permission);
                authentizationInfo.addStringPermission(permission.getPermissionSign());
            }

        }

        return authentizationInfo;
    }

    /**
     * 登陆验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = String.valueOf(authenticationToken.getPrincipal());
        String password = new String((char[])authenticationToken.getCredentials());
        //通过数据库进行验证
        final boolean authentication = isUser.authentication(new e_user(username,password));
        if(!authentication){
            throw new AuthenticationException("用户名或密码错误.");
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username,password,getName());
        return authenticationInfo;
    }
}
