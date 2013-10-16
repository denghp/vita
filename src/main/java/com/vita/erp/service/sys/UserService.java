package com.vita.erp.service.sys;

import com.vita.erp.entity.sys.User;
import com.vita.erp.entity.sys.UserStatus;
import com.vita.erp.shiro.persistence.UserMapper;
import com.vita.erp.utils.Md5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with smart-erp.
 * User: denghp
 * Date: 10/15/13
 * Time: 1:11 AM
 * Description:
 */
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    public boolean saveUser(User user) {

        user.randomSalt();
        user.setPassword(encryptPassword(user.getUsername(), user.getPassword(), user.getSalt()));
        int id = userMapper.saveUser(user);
        System.out.print("id : " + id);
        if (id > 0) {
            return true;
        }
        return false;

    }

    /**
     * 密码使用MD5算法加密
     *
     * @param username
     * @param password
     * @param salt
     * @return
     */
    public String encryptPassword(String username, String password, String salt) {
        return Md5Utils.hash(username + password + salt);
    }


    public User getUser(String userName) {
        return userMapper.getUserByName(userName);
    }

    public User login(String username, String password) {
        User user = userMapper.getUserByName(username);
        if (user == null || Boolean.TRUE.equals(user.getDeleted())) {
            logger.error("{} login failed, user is not exists!!!", username);
        }
        if (user.getStatus() == UserStatus.blocked) {
            logger.error("{} login failed, user is blocked!", username);
        }

        return user;
    }

    public boolean changePassword(Long userId, String password) {

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public User getUserByname(String username) {
        return userMapper.getUserByName(username);
    }

    public User getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }

    public void deleteById(Long userId) {
        userMapper.delete(userId);
    }
}
