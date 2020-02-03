package service;

import bean.UserAddress;

import java.util.List;

/**
 * @author GYY
 * @date 2020/2/3 18:33
 */
public interface UserService {

    /**
     * 根据用户id返回所有的收货地址
     * @param userId id
     * @return list
     */
     List<UserAddress> getUserAddressList(String userId);
}
