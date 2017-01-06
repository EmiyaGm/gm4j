package service;

import dao.id_user;
import entity.e_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gm on 17/1/6.
 */
@Service
public class s_user implements is_user{

    @Autowired
    private id_user idUser;

    @Override
    @Transactional
    public int add(e_user user) {
        return 0;
    }

    @Override
    @Transactional
    public boolean del(int id) {
        return false;
    }

    @Override
    @Transactional
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
