package com.company;

public class StaticClass {
    static int count = 0;
    int noStatic;

    public  void setCount(int count) {
        StaticClass.count = count;
    }
}
