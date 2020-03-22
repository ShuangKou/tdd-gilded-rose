package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import cn.xpbootcamp.gilded_rose.common.ProductType;


/**
 * @author shuang.kou
 */
public class Sulfuras extends Product {
    public Sulfuras(Integer sellIn, Integer quality) {
        super("萨弗拉斯", sellIn, quality);
    }

    @Override
    protected ProductType getProductType() {
        return ProductType.SULFURAS;
    }
}
