import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;

/**
 * @author GYY
 * @date 2020/2/3 21:29
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);
        System.out.println("调用接口");
        orderService.initOrder("1");
        System.in.read();
    }
}
