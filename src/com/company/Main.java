package com.company;

public class Main {

    public static void main(String[] args) {
        Pojazdy p1 = new Pojazdy(10, 200, "tramwajowa");
        System.out.println(p1);
        Autobus a1 = new Autobus(2, 43, "tramwajowa", 100);
        System.out.println(a1);
    }
}
