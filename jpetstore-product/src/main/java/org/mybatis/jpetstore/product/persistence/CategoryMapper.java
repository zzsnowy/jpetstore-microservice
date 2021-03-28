package org.mybatis.jpetstore.product.persistence;

import java.util.List;
import org.mybatis.jpetstore.domain.Category;

public interface CategoryMapper {

    // 得到所有商品大类
    List<Category> getCategoryList();

    // 根据货物ID得到商品大类
    Category getCategory(String categoryId);
}
