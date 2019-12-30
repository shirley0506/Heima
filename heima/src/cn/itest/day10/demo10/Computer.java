package cn.itest.day10.demo10;

public class Computer {

    //基本功能-开机
    public void powerOn() {
        System.out.println("电脑开机");
    }
    //基本功能-关机
    public void powerOff() {
        System.out.println("电脑关机");
    }

    public void device(Usb usb) {
        usb.open();
        usb.close();
    }

}
