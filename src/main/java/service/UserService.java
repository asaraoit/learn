package service;


import pojo.User;
import pojo.UserExample;

import java.util.List;

public interface UserService {

    void register(User lUser);


    List<User> getAll(UserExample userExample);


}
