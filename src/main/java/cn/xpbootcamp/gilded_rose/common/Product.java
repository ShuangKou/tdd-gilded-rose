package cn.xpbootcamp.gilded_rose.common;


/**
 * @author shuang.kou
 */
public class Product {
    private String name;
    private Integer sellIn;
    private Integer quality;

    public Product(Integer sellIn, Integer quality) {
        this("普通商品", sellIn, quality);
    }

    public Product(String name, Integer sellIn, Integer quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateProductQualityAndSellIn() {
        updateSellIn();
        updateQuality();
    }

    private void updateSellIn() {
        if (!ProductType.SULFURAS.equals(this.getProductType())) {
            this.sellIn--;
        }
    }

    private void updateQuality() {
        int commonQualityChangeStep = 1;
        int backstagePassQualityChangeStep1 = 2;
        int backstagePassQualityChangeStep2 = 3;
        if (ProductType.NORMAL.equals(this.getProductType())) {
            if (this.sellIn < 0) {
                reduceQuality(commonQualityChangeStep * 2);
            }
        }
        if (ProductType.AGED_BRIE.equals(this.getProductType())) {
            plusQuality(commonQualityChangeStep);
        }

        if (ProductType.SULFURAS.equals(this.getProductType())) {
            return;
        }
        if (ProductType.BACKSTAGE_PASS.equals(this.getProductType())) {
            if (sellIn < 0) {
                this.quality = 0;
                return;
            }
            if (sellIn + 1 < 6) {
                plusQuality(backstagePassQualityChangeStep2);
                return;
            }
            if (sellIn + 1 < 11) {
                plusQuality(backstagePassQualityChangeStep1);
            }
        }
    }

    private void reduceQuality(int num) {
        this.quality -= num;
        if (this.quality < 0) {
            this.quality = 0;
        }
    }

    private void plusQuality(int num) {
        this.quality += num;
        if (this.quality > 49) {
            this.quality = 50;
        }
    }

    protected ProductType getProductType() {
        return ProductType.NORMAL;
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
