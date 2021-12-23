package org.homework.mobile.app.app;


import org.homework.mobile.app.model.*;
import org.homework.mobile.app.model_user.User;

import java.util.Scanner;

// работа с клиентским приложением App
public class App {
    public static <category> void main(String[] args) {
        // scaner для name и city
        Scanner scanner = new Scanner(System.in);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Enter name and city: ");
        // работа с generic user
        User<String, Integer> user = new User<>("vlad234", 26);
        // работа с builder для user1
        User user1 = new User.Builder()
                .withName(scanner.next())
                .withCity(scanner.next())
                .build();

        System.out.println("Your id: " + user.getId() + " ; " + " Your age: " + user.getAge() + ".");
        System.out.println(user1);

        System.out.println("_________________________________________________________________________________________");
        // вывод на экран модели телефона Apple через Builder
        Apple apple = new Apple.Builder()
                .withBrand("Apple")
                .withAppleCount(3)
                .withDayBuy("02.12.2021")
                .build();
        apple.mobileTest();
        {
            // работа с Apple-перечисления
            System.out.println("...............................");
            System.out.print("Category: ");
            MobileName mobileName = MobileName.Apple;
            System.out.println(mobileName.Apple.getCategory());
            System.out.print("Priority: ");
            System.out.println(mobileName.Apple.getPriority());
            System.out.println("...............................");
        }
        System.out.println(apple);
        apple.call();
        System.out.println("_________________________________________________________________________________________");
        // вывод на экран модели телефона Oppo
        Oppo oppo = new Oppo("Oppo", 7, "07.12.2021");
        oppo.mobileTest();
        {
            // работа с Oppo-перечисления
            System.out.println("...............................");
            System.out.print("Category: ");
            MobileName mobileName = MobileName.Oppo;
            System.out.println(mobileName.Oppo.getCategory());
            System.out.print("Priority: ");
            System.out.println(mobileName.Oppo.getPriority());
            System.out.println("...............................");
        }
        System.out.println(oppo);
        oppo.call();

        System.out.println("_________________________________________________________________________________________");
        // вывод на экран модели телефона Samsung через Builder
        Samsung samsung = new Samsung.Builder()
                .withBrand("Samsung")
                .withSamsungCount(3)
                .withDayBuy("03.12.2021")
                .build();
        samsung.mobileTest();
        {
            // работа с Samsung-перечисления
            System.out.println("...............................");
            System.out.print("Category: ");
            MobileName mobileName = MobileName.Samsung;
            System.out.println(mobileName.Samsung.getCategory());
            System.out.print("Priority: ");
            System.out.println(mobileName.Samsung.getPriority());
            System.out.println("...............................");
        }
        System.out.println(samsung);
        samsung.call();

        System.out.println("_________________________________________________________________________________________");
        // вывод на экран модели телефона Xiaomi
        Xiaomi xiaomi = new Xiaomi("Xiaomi", 5,  "09.12.2021");
        xiaomi.mobileTest();
        {
            // работа с Xiaomi-перечисления
            System.out.println("...............................");
            System.out.print("Category: ");
            MobileName mobileName = MobileName.Xiaomi;
            System.out.println(mobileName.Xiaomi.getCategory());
            System.out.print("Priority: ");
            System.out.println(mobileName.Xiaomi.getPriority());
            System.out.println("...............................");
        }
        System.out.println(xiaomi);
        xiaomi.call();

    }
}
