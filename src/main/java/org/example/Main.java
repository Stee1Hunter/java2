package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите первую координату");
        System.out.println("введите широту первой координаты:");
        double FirstShirota = cs.nextDouble();
        System.out.println("введите долготу первой координаты:");
        double FirstDolgota = cs.nextDouble();
        System.out.println("Введите вторую координату");
        System.out.println("введите широту второй координаты:");
        double SecondShirota = cs.nextDouble();
        System.out.println("введите долготу второй координаты:");
        double SecondDolgota = cs.nextDouble();
        final double rad = 6371;
        FirstShirota = Math.toRadians(FirstShirota);
        FirstDolgota = Math.toRadians(FirstDolgota);
        SecondShirota = Math.toRadians(SecondShirota);
        SecondDolgota = Math.toRadians(SecondDolgota);
        double otvet = rad * 2 * Math.asin(Math.sqrt(Math.pow(Math.sin((SecondDolgota-FirstDolgota)/2), 2) + Math.pow(Math.sin((SecondShirota-FirstShirota)/2), 2) * Math.cos(FirstDolgota) * Math.cos(SecondDolgota)));
        System.out.println(otvet + " км");
    }
}