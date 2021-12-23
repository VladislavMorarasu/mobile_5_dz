package org.homework.mobile.app.model;

    // создание абстрактного класса MobileShop (работа с полиморфизмом)
    public abstract class MobileShop implements callable {
        protected String brand;
        protected int count;
        protected String category;
        protected String priority;
        protected String dayBuy;

        // создание метода mobileTest
        public void mobileTest() {
            System.out.println("I'm mobile");
        }

    }
