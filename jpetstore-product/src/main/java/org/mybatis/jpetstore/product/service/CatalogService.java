package org.mybatis.jpetstore.product.service;

import org.mybatis.jpetstore.product.domain.Category;
import org.mybatis.jpetstore.product.domain.Product;
import org.mybatis.jpetstore.product.domain.Item;

import java.util.List;


public interface CatalogService {
    public List<Category> getCategoryList();

    public Category getCategory(String categoryId);

    public Product getProduct(String productId);

    public List<Product> getProductListByCategory(String categoryId) ;

    // TODO enable using more than one keyword
    public List<Product> searchProductList(String keyword) ;

    public List<Item> getItemListByProduct(String productId) ;

    public Item getItem(String itemId) ;

    public boolean isItemInStock(String itemId) ;

}
