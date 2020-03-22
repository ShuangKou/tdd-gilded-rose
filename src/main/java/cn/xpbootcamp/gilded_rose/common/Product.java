package cn.xpbootcamp.gilded_rose.common;


/**
 * @author shuang.kou
 */
public class Product {
    private String name;
    private Integer sellIn;
    private Integer quality;

    public Product(String name, Integer sellIn, Integer quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateProductQualitySellIn() {
        updateSellIn();
        updateQuality();
    }

    private void updateSellIn() {
        if (!ProductType.SULFURAS.equals(this.getProductType())) {
            sellIn--;
        }
    }

    private void updateQuality() {
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

    public String getName() {
        return name;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }
}
