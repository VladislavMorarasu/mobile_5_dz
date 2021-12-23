package org.homework.mobile.app.model;
// создание класса-наследника Oppo
public class Oppo extends MobileShop {
    private String brand;
    private int oppoCount;
    private String dayBuy;

    public Oppo() {

    }
    // работа с конструктором
    public Oppo(String brand, int oppoCount, String dayBuy) {
        this.brand = brand;
        this.oppoCount = oppoCount;
        this.dayBuy = dayBuy;
    }
    // реализация метода в Oppo(применение super)
    @Override
    public void mobileTest() {
        super.mobileTest();
        System.out.println("I'm OPPO!))");
    }
    // работа с наследованием
    @Override
    public void call() {
        System.out.println(brand + " call badly...");
    }
    // переопределение toString
    @Override
    public String toString() {
        return "|" +
                "brand='" + brand + '\'' +
                ", oppoCount= " + oppoCount +
                ", dayBuy='" + dayBuy + '\'' +
                '|';
    }
    // работа с get и  set
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOppoCount() {
        return oppoCount;
    }

    public void setOppoCount(int oppoCount) {
        this.oppoCount = oppoCount;
    }

    public String getDayBuy() {
        return dayBuy;
    }

    public void setDayBuy(String dayBuy) {
        this.dayBuy = dayBuy;
    }
}
