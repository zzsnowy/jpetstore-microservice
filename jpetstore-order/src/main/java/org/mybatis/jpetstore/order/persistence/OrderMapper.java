package org.mybatis.jpetstore.order.persistence;

import java.util.List;
import org.mybatis.jpetstore.domain.Order;
public interface OrderMapper {

    // 根据用户名得到订单
    List<Order> getOrdersByUsername(String username);

    // 根据订单ID得到订单
    Order getOrder(int orderId);

    // 插入新订单
    void insertOrder(Order order);

    // 插入新订单状态
    void insertOrderStatus(Order order);

}
