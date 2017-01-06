package dao;

import entity.e_role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
@Repository
public class d_role implements id_role{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public int add(e_role role) {
        return 0;
    }

    @Override
    public boolean del(int id) {
        return false;
    }

    @Override
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
