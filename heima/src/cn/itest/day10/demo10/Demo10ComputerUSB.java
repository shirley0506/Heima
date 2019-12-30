package cn.itest.day10.demo10;

public class Demo10ComputerUSB {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        //创建一个设备
        Keyboard keyboard = new Keyboard();
        computer.device(keyboard);  //用实现类传参
        System.out.println("===================");
        Usb usb = new Mouse();  //使用多态
        computer.device(usb);   //用usb类传参
        computer.powerOff();
    }
}
