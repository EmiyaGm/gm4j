package security;

/**
 * 角色标识配置类
 * 与role_info角色表中的role_sign字段相对应
 * 使用：
 * @RequiresRoles(value = RoleSign.ADMIN)
 * public String admin(){
 *     return "拥有admin角色，能访问";
 * }
 * Created by gm on 17/1/7.
 */
public class RoleSign {
    /**
     * 普通后台管理员标识
     */
    public static final String ADMIN = "admin";

    /**
     * 客户经理标识
     */
    public static final String CONSULTANT = "consultant";

    /**
     * VIP客户标识
     */
    public static final String VIP_USER = "vip_user";

    /**
     * 商家标识
     */
    public static final String MERCHANT = "merchant";

    /**
     * 添加更多...
     */
}
