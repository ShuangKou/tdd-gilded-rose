package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;

import java.util.List;

/**
 * @author shuang.kou
 */
public class GildedRose {
    private List<Product> products;

    public GildedRose(List<Product> products) {
        this.products = products;
    }

    public void updateAllProductQualitySellIn() {
        products.forEach(Product::updateProductQualityAndSellIn);
    }
}
