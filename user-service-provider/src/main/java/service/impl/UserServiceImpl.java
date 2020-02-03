package service.impl;

import bean.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author GYY
 * @date 2020/2/3 18:36
 */
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"广州市白云区科技园38号","1","李老师","888888888","啥东西");
        UserAddress address2 = new UserAddress(2,"汕头市龙湖区科技园38号","1","李老师","888888888","啥东西");
        return Arrays.asList(address1,address2);
    }
}
