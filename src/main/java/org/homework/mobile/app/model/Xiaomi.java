package org.homework.mobile.app.model;
// создание класса-наследника Xiaomi
public class Xiaomi extends MobileShop {
    private String brand;
    private int xiaomiCount;
    private String dayBuy;

    public Xiaomi() {

    }
    // работа с конструктором
    public Xiaomi(String brand, int xiaomiCount, String dayBuy) {
        this.brand = brand;
        this.xiaomiCount = xiaomiCount;
        this.dayBuy = dayBuy;
    }
    // реализация метода в Xiaomi
    @Override
    public void mobileTest() {
        System.out.println(brand + "- i'm mobile. Use the Qualcomm platform!!");
    }
    // работа с наследованием
    @Override
    public void call() {
        System.out.println(brand + " call quickly...");
    }
    // переопределение toString
    @Override
    public String toString() {
        return "|" +
                "brand='" + brand + '\'' +
                ", xiaomiCount= " + xiaomiCount +
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

    public int getXiaomiCount() {
        return xiaomiCount;
    }

    public void setXiaomiCount(int xiaomiCount) {
        this.xiaomiCount = xiaomiCount;
    }

    public String getDayBuy() {
        return dayBuy;
    }

    public void setDayBuy(String dayBuy) {
        this.dayBuy = dayBuy;
    }
}

