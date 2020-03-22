package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import cn.xpbootcamp.gilded_rose.common.ProductType;

/**
 * @author shuang.kou
 */
public class AgedBrie extends Product {
    @Override
    protected ProductType getProductType() {
        return ProductType.AGED_BRIE;
    }
}
