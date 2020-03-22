package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import cn.xpbootcamp.gilded_rose.common.ProductType;

public class BackstagePass extends Product {
    @Override
    protected ProductType getProductType() {
        return ProductType.BACKSTAGE_PASS;
    }
}
