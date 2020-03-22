package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import cn.xpbootcamp.gilded_rose.common.ProductType;


/**
 * @author shuang.kou
 */
public class AgedBrie extends Product {

    public AgedBrie(Integer sellIn, Integer quality) {
        super("陈年干酪", sellIn, quality);
    }

    @Override
    protected ProductType getProductType() {
        return ProductType.AGED_BRIE;
    }
}
