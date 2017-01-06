package service;

import dao.id_permission;
import entity.e_permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
@Service
public class s_permission implements is_permission{

    @Autowired
    private id_permission idPermission;

    @Override
    @Transactional
    public int add(e_permission permission) {
        return 0;
    }

    @Override
    @Transactional
    public boolean del(int id) {
        return false;
    }

    @Override
    @Transactional
    public boolean edit(e_permission permission) {
        return false;
    }

    @Override
    public List<e_permission> getAll() {
        return null;
    }

    @Override
    public List<e_permission> getByRoleid(Long id) {
        return null;
    }
}
