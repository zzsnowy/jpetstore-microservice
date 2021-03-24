package org.mybatis.jpetstore.order.feign;

import org.mybatis.jpetstore.domain.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient("jpetstore-product")
public interface CatalogFeignService {
    @RequestMapping("/catalog/get")
    public boolean isItemInStock(@RequestParam("itemId") String itemId);
    @RequestMapping("/catalog/ge")
    public Item getItem(@RequestParam("itemId") String itemId);
}
