package service;

import entity.e_permission;

import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
public interface is_permission {
    int add(e_permission permission);
    boolean del(int id);
    boolean edit(e_permission permission);
    List<e_permission> getAll();
    List<e_permission> getByRoleid(Long id);
}
