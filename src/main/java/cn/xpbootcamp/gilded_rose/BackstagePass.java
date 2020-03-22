package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import cn.xpbootcamp.gilded_rose.common.ProductType;

/**
 * @author shuang.kou
 */
public class BackstagePass extends Product {
    public BackstagePass(Integer sellIn, Integer quality) {
        super("后台门票", sellIn, quality);
    }

    @Override
    protected ProductType getProductType() {
        return ProductType.BACKSTAGE_PASS;
    }
}
