package com.thillel.denisov.homeworks.homeworks12.homephone;

public class Android implements Smartphones, LinuxOS {

    @Override
    public void operationSysLin() {
        System.out.println("Hello Android");

    }

    @Override
    public void call() {
        System.out.println("Android calling");
    }

    @Override
    public void sms() {
        System.out.println("Android massage");

    }

    @Override
    public void internet() {
        System.out.println("Android connecting...");

    }
}
