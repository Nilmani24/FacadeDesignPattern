package com.facade;

public class HardWareCheck {
    HardDiskCheck hardDiskCheck;
    DriverCheck driverCheck;

    public HardWareCheck() {
        this.hardDiskCheck = new HardDiskCheck();
        this.driverCheck = new DriverCheck();
    }

    public void checkHardware(){
        System.out.println("checking hardware");
        hardDiskCheck.check();
        driverCheck.check();

    }
}
