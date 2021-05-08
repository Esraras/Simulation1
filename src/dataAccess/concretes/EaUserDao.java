package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class EaUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("EaUserDao ile eklendi " + user.getFistName() +" "+ user.getLastName() );
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
