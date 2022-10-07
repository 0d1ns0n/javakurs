package com.thillel.denisov.homeworks.homeworks12.homephone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.operationSysIos();
        System.out.println();
        Android android = new Android();
        android.call();
        android.sms();
        android.internet();
        android.operationSysLin();
    }
}
