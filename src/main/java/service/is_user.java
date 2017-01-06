package service;

import entity.e_user;

import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
public interface is_user {
    int add(e_user user);
    boolean del(int id);
    boolean edit(e_user user);
    e_user getByUsername(String username);
    List<e_user>getAll();
    boolean authentication(e_user user);
}
