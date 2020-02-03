package service;

/**
 * @author GYY
 * @date 2020/2/3 18:44
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId 用户id
     */
    void initOrder(String userId);
}
