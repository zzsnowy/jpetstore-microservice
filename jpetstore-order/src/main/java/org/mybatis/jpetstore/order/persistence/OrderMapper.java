package org.mybatis.jpetstore.order.persistence;

import org.mybatis.jpetstore.order.domain.Order;
import java.util.List;

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
