package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.common.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void should_update_quality_success() {
        AgedBrie agedBrie = new AgedBrie(9, 9);
        BackstagePass backstagePass = new BackstagePass(9, 9);
        Sulfuras sulfuras = new Sulfuras(9, 9);
        List<Product> products = Arrays.asList(agedBrie, backstagePass, sulfuras);
        GildedRose gildedRose = new GildedRose(products);
        // 9 天过去了
        for (int i = 0; i < 9; i++) {
            gildedRose.updateAllProductQualitySellIn();
        }

        assertEquals(0, agedBrie.getSellIn().intValue());
        assertEquals(19, agedBrie.getQuality().intValue());

        assertEquals(0, backstagePass.getSellIn().intValue());
        assertEquals(0, backstagePass.getQuality().intValue());

        assertEquals(9, sulfuras.getSellIn().intValue());
        assertEquals(18, sulfuras.getQuality().intValue());
    }
}
