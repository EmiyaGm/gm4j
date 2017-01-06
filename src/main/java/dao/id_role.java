package dao;

import entity.e_role;

import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
public interface id_role {
    int add(e_role role);
    boolean del(int id);
    boolean edit(e_role role);
    List<e_role> getAll();
    List<e_role> getByUserid(Long user_id);
}
