package com.company;

public class Main {

    public static void main(String[] args) {

        StaticClass staticClass = new StaticClass();
        StaticClass staticClass1 = new StaticClass();


        staticClass.setCount(1);
        staticClass.setCount(2);

        System.out.println("print message");
        System.out.println(StaticClass.count);
    }
}
