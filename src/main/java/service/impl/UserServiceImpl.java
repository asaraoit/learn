package service.impl;

import dao.UserMapper;
import pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper lUserMapper;


    @Override
    public void register(User lUser) {

        lUserMapper.insert(lUser);


    }
}
