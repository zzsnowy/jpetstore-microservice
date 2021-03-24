package org.mybatis.jpetstore.order.feign;

import org.mybatis.jpetstore.domain.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("jpetstore-product")
public interface CatalogFeignService {
    @GetMapping("/catalog/get/{itemId}")
    public boolean isItemInStock(@PathVariable("itemId") String itemId);
    @GetMapping("/catalog/getso/{itemId}")
    public Item getItem(@PathVariable("itemId") String itemId) ;
}
