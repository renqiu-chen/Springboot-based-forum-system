package rqchen.fkbbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rqchen.fkbbs.entity.User;
import rqchen.fkbbs.mapper.Usermapper;

import java.util.List;

@Service
public class UserService {
    @Autowired
    Usermapper usermapper;

    public List<User> themeList(){ return usermapper.getAllUser(); }

    public int insert(User user){
        return usermapper.InsertUser(user);
    }

    public int delete(Integer id){
        return usermapper.delUserById(id);
    }

    public int update(User user){
        return usermapper.UpdateUser(user);
    }

    public User getById(Integer id) {
        return usermapper.getUserById(id);
    }

    public User login(String mail,String pwd){return usermapper.getUserByInfo(mail, pwd);}

    public User verifymail(String mail){return usermapper.getUserByMail(mail);}
}