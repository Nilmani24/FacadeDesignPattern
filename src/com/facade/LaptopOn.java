package com.facade;

public class LaptopOn {

    HardWareCheck hardWareCheck;
    SoftwareCheck softwareCheck;

    public LaptopOn() {
        this.hardWareCheck = new HardWareCheck();
        this.softwareCheck = new SoftwareCheck();
    }

    public void check(){
        hardWareCheck.checkHardware();
        softwareCheck.check();
    }
}
