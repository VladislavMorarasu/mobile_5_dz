package org.homework.mobile.app.model;

// создание класса-наследника Samsung
public class Samsung extends MobileShop {
    private String brand;
    private int samsungCount;
    private String dayBuy;

    private Samsung() {
    }
    // работа с конструктором
    public Samsung(String brand, int samsungCount, String dayBuy) {
        this.brand = brand;
        this.samsungCount = samsungCount;
        this.dayBuy = dayBuy;
    }
    // реализация метода в Samsung
    @Override
    public void mobileTest() {
        System.out.println(brand + "- i'm mobile. We have different phone models.");
    }
    // переопределение toString
    @Override
    public String toString() {
        return "|" +
                "brand='" + brand + '\'' +
                ", samsungCount= " + samsungCount +
                ", dayBuy='" + dayBuy + '\'' +
                '|';
    }
    // работа с наследованием
    @Override
    public void call() {
        System.out.println(brand +" call good...");
    }
    // работа с Builder
    public static class Builder {
        private Samsung newSamsung;

        public Builder() {

            newSamsung = new Samsung();
        }
        public Samsung.Builder withBrand(String brand) {
            newSamsung.brand = brand;
            return this;
        }
        public Samsung.Builder withSamsungCount(int samsungCount) {
            newSamsung.samsungCount = samsungCount;
            return this;
        }
        public Samsung.Builder withDayBuy(String dayBuy) {
            newSamsung.dayBuy = dayBuy;
            return this;
        }
        public Samsung build() {
            return newSamsung;
        }


    }
}

