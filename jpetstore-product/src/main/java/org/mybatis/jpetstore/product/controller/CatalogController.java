package org.mybatis.jpetstore.product.controller;

import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.product.service.CatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes({"product", "cart","account"})
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    // 日志功能
    private final Logger logger = LoggerFactory.getLogger(CatalogController.class);

    // 跳往主界面
    @GetMapping("/catalog/main")
    public String viewMain(){
        logger.info("到达主页");
        return "catalog/main";
    }

    // 跳往商品大类
    @GetMapping("/catalog/category")
    public String viewCategory(@RequestParam("categoryId") String categoryId, Model model){

        if(categoryId != null){
            Category category = catalogService.getCategory(categoryId);
            List<Product> productList = catalogService.getProductListByCategory(categoryId);
            model.addAttribute("category",category);
            model.addAttribute("productList",productList);
        }
        logger.info("跳往商品大类,Id:"+categoryId);
        return "catalog/category";
    }

    // 跳往商品小类
    @GetMapping("/catalog/product")
    public String viewProduct(@ModelAttribute("productId") String productId, HttpSession session, Model model){
//        logger.debug("log..."); // 输出DEBUG级别的日志
        if(productId != null){
            Product product = catalogService.getProduct(productId);
            List<Item> itemList = catalogService.getItemListByProduct(productId);

            logger.info("跳到商品小类成功"+product.toString());
            session.setAttribute("product",product);
            model.addAttribute("itemList",itemList);
            model.addAttribute("product",product);
        }
        logger.info("跳往商品小类,Id:"+productId);
        return "catalog/product";
    }

    // 跳往某一特定商品
    @GetMapping("/catalog/item")
    public String viewItem(@RequestParam("itemId") String itemId, Model model){

        if(itemId != null){
            Item item = catalogService.getItem(itemId);

            model.addAttribute("item",item);

        }
        logger.info("跳往某一特定商品,Id:"+itemId);
        return "catalog/item";
    }

    // 搜索商品
    @PostMapping("/searchProduct")
    public String searchProduct(@RequestParam("keyword") String keyword,Model model){

        if(keyword.trim().equals("")){
            return "catalog/main";
        }

        List<Product> productList = catalogService.searchProductList(keyword);
        model.addAttribute("productList",productList);
        logger.info("搜索商品,关键字:"+keyword);
        return "catalog/searchProduct";
    }

    //by zx
    @RequestMapping("/catalog/get")
    @ResponseBody
    public boolean isItemInStock(@RequestParam("itemId") String itemId){

       boolean tmp=catalogService.isItemInStock(itemId);
        logger.info("****itemId是:"+itemId);
       return tmp;
    }
    @RequestMapping("/catalog/ge")
    @ResponseBody
    public Item getItem(@RequestParam("itemId") String itemId){

        return catalogService.getItem(itemId);
    }

}
