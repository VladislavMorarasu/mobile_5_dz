package org.homework.mobile.app.model;
// создание класса-наследника Apple
public class Apple extends MobileShop {
    protected String brand;
    protected int appleCount;
    protected String dayBuy;

    private Apple () {
    }
    // работа с конструктором
    public Apple(String brand, int appleCount, String dayBuy) {
        this.brand = brand;
        this.appleCount = appleCount;
        this.dayBuy = dayBuy;
    }
    // реализация метода в Apple
    @Override
    public void mobileTest() {
        System.out.println(brand + "- i'm mobile. I am dear.");//вывод строки метода mobileTest()
    }
    // переопределение toString
    @Override
    public String toString() {
        return "|" +
                "brand='" + brand + '\'' +
                ", appleCount= " + appleCount +
                ", dayBuy='" + dayBuy + '\'' +
                '|';
    }
    // работа с наследованием
    @Override
    public void call() {
        System.out.println(brand +" call slowly...");
    }
    // работа с Builder
    public static class Builder {
        private Apple newApple;

        public Builder() {
            newApple = new Apple();
        }
        public Builder withBrand(String brand) {
            newApple.brand = brand;
            return this;
        }
        public Builder withAppleCount(int appleCount) {
            newApple.appleCount = appleCount;
            return this;
        }
        public Builder withDayBuy(String dayBuy) {
            newApple.dayBuy = dayBuy;
            return this;
        }
        public Apple build() {
            return newApple;
        }
    }
}
