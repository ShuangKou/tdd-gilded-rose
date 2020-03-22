package cn.xpbootcamp.gilded_rose.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author shuang.kou
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Product {
    private String name;
    private Integer sellIn;
    private Integer quality;

    public void updateQuality() {
        int commonQualityChangeStep = 1;
        int backstagePassQualityChangeStep1 = 2;
        int backstagePassQualityChangeStep2 = 3;
        if (ProductType.AGED_BRIE.equals(this.getProductType())) {
            if (sellIn > 0) {
                plusQuality(commonQualityChangeStep);
            } else {
                reduceQuality(commonQualityChangeStep * 2);
            }
        }

        if (ProductType.SULFURAS.equals(this.getProductType())) {
            plusQuality(commonQualityChangeStep);
        }
        if (ProductType.BACKSTAGE_PASS.equals(this.getProductType())) {
            if (sellIn < 11) {
                plusQuality(backstagePassQualityChangeStep1);
            }
            if (sellIn < 6) {
                plusQuality(backstagePassQualityChangeStep2);
            }
            if (sellIn <= 0) {
                this.quality = 0;
            }
        }
    }

    private void reduceQuality(int num) {
        if (this.quality > 0) {
            this.quality += num;
        }
    }

    private void plusQuality(int num) {
        if (this.quality < 49) {
            this.quality += num;
        }
    }


    protected ProductType getProductType() {
        return null;
    }
}
