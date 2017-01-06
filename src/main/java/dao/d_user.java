package dao;

import entity.e_user;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
@Repository
public class d_user implements id_user{

    @PersistenceContext
    private EntityManager manager;
    @Override
    public int add(e_user user) {
        return 0;
    }

    @Override
    public boolean del(int id) {
        return false;
    }

    @Override
    public boolean edit(e_user user) {
        return false;
    }

    @Override
    public e_user getByUsername(String username) {
        return null;
    }

    @Override
    public List<e_user> getAll() {
        return null;
    }

    @Override
    public boolean authentication(e_user user) {
        return false;
    }
}
