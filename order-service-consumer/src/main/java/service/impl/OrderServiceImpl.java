package service.impl;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * @author GYY
 * @date 2020/2/3 18:46
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;
    public void initOrder(String userId) {
        System.out.println("id = " + userId );
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress address : userAddressList) {
            System.out.println(address.getUserAddress());
        }
    }
}
