package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Pepsi(16, 0));
        System.out.println(Pepsi(22, 8));
        System.out.println(Pepsi(38, 14));
        System.out.println(Pepsi(22, 28));
    }

    public static String Pepsi(int age, int temperature) {
        if (age > 10 && age > 35 && temperature > 20 && temperature < 30) {
            return "Можно идти гулять";
        }
        if (age > 20 && temperature > -20 && temperature < 30) {
            return "Можно идти гулят";
        } else if (age > 35 && temperature >= 10 && temperature <= 20) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }

    }
}

