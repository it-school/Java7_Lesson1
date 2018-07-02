package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        String choose;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную а");
        a = in.nextDouble();
        System.out.println("Введите переменную b");
        b = in.nextDouble();

        while (true) {
            System.out.println("Введите необходимое действие");
            System.out.println("1 - плюс, 2 - минус, 3 - умножение, 4 - деление, quit - для выхода");
            choose = in.next();
            if (choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") || choose.equals("quit")){
                break;
            }
        }
        switch (choose){
            case "1":
                plus(a, b);
                break;
            case "2":
                minus(a, b);
                break;
            case "3":
                multiply(a, b);
                break;
            case "4":
                divide(a, b);
                break;
            case "quit":
                break;
        }

    }

    static public void multiply (double a, double b){
        System.out.println(a * b);
    }

    static public void divide (double a, double b){
        System.out.println(a / b);
    }

    static public void plus (double a, double b){
        System.out.println(a + b);
    }

    static public void minus (double a, double b){
        System.out.println(a - b);
    }

    // TODO: 02.07.2018 Реализовать функции для подсчета числа в указанной степени, извлечение квадратного корня из числа
    // TODO: 02.07.2018 дополнительно - реализовать решение квадратного уравнения через функцию(добавить дополнительный параметр)


}
