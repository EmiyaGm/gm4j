package dao;

import entity.e_permission;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
@Repository
public class d_permission implements id_permission{

    @PersistenceContext
    private EntityManager manager;
    @Override
    public int add(e_permission permission) {
        return 0;
    }

    @Override
    public boolean del(int id) {
        return false;
    }

    @Override
    public boolean edit(e_permission permission) {
        return false;
    }

    @Override
    public List<e_permission> getAll() {
        return null;
    }

    @Override
    public List<e_permission> getByRoleid(Long role_id) {
        return null;
    }
}
