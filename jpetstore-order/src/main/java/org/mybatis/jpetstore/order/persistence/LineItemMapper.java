package org.mybatis.jpetstore.order.persistence;

import java.util.List;
import org.mybatis.jpetstore.domain.LineItem;
public interface LineItemMapper {
    // 根据订单ID得到订单中的商品项
    List<LineItem> getLineItemsByOrderId(int orderId);

    // 插入商品项
    boolean insertLineItem(LineItem lineItem);
}
