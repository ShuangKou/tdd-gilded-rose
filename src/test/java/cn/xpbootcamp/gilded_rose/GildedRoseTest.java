package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void should_update_quality_success() {
        Product product = new Product(6, 6);
        AgedBrie agedBrie = new AgedBrie(9, 9);
        Sulfuras sulfuras = new Sulfuras(11, 9);
        BackstagePass backstagePass = new BackstagePass(10, 9);
        List<Product> products = Arrays.asList(product, agedBrie, backstagePass, sulfuras);
        GildedRose gildedRose = new GildedRose(products);
        // 9 天过去了
        for (int i = 0; i < 9; i++) {
            gildedRose.updateAllProductQualitySellIn();
        }

        assertEquals(-3, product.getSellIn().intValue());
        assertEquals(0, product.getQuality().intValue());


        assertEquals(0, agedBrie.getSellIn().intValue());
        assertEquals(18, agedBrie.getQuality().intValue());


        assertEquals(11, sulfuras.getSellIn().intValue());
        assertEquals(9, sulfuras.getQuality().intValue());

        assertEquals(1, backstagePass.getSellIn().intValue());
        assertEquals(31, backstagePass.getQuality().intValue());
    }
}
