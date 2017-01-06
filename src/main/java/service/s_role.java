package service;

import dao.id_role;
import entity.e_role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
public class s_role implements is_role{

    @Autowired
    private id_role idRole;

    @Override
    @Transactional
    public int add(e_role role) {
        return 0;
    }

    @Override
    @Transactional
    public boolean del(int id) {
        return false;
    }

    @Override
    @Transactional
    public boolean edit(e_role role) {
        return false;
    }

    @Override
    public List<e_role> getAll() {
        return null;
    }

    @Override
    public List<e_role> getByUserid(Long user_id) {
        return null;
    }
}
