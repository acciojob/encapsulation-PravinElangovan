package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.setName("Pravin");
        System.out.println(rw.getName());

        // Error : Name has a private access in com.driver.RWOnly
    }
}