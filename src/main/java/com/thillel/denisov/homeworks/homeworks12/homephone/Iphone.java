package com.thillel.denisov.homeworks.homeworks12.homephone;

public class Iphone implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Ios calling ");
    }

    @Override
    public void sms() {
        System.out.println("Ios massage ");
    }

    @Override
    public void internet() {
        System.out.println("Ios connecting... ");
    }

    @Override
    public void operationSysIos() {
        System.out.println("Ios operation sys. start! ");
    }
}

