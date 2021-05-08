package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;

    public UserManager (UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        if (user.getFistName().length() > 1) {

        }
        else if (user.getLastName().length() > 1){

        }
        else if(user.getPassword() > 5 ){
            System.out.println("Kullanıcı eklendi");
        }else {
            System.out.println("Bilgiler uygun değil");
            return;
        }
        this.userDao.add(user);
    }

    public List<User> getAll() { return null; }

}
