package cn.phpst.service.impl;

import cn.phpst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
//    @Autowired
//    private UsersMapper usersMapper;
    @Override

    public boolean queryUsernameIsExist(String username) {
        return false;
    }
}
