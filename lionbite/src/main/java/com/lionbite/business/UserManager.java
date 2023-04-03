package com.lionbite.business;

import com.lionbite.dao.UserDao;
import com.lionbite.model.User;

public class UserManager {
    public static User get(Long id){
        UserDao dao = new UserDao();
        User user  = dao.get(id);
        dao.close();

        return  user;
    }

    public static Long save(User user){
        UserDao dao = new UserDao();
        dao.save(user);
        dao.close();
        return user.getId();
    }
}
