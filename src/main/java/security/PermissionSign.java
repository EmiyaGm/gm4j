package security;

/**
 * 权限标识配置类
 * 与permission权限表中的permission_sign字段相对应
 * 使用：
 * @RequiresPermissions(Value = PermissionConfig.USER_CREATE)
 * public String create(){
 *     return "拥有user:create权限，能访问";
 * }
 * Created by gm on 17/1/7.
 */
public class PermissionSign {
    /**
     * 用户新增权限标识
     */
    public static final String USER_CREATE = "user:create";

    /**
     * 用户删除权限标识
     */
    public static final String USER_DELETE = "user:delete";

    /**
     * 添加更多...
     */
}
