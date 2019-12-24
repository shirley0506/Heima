package cn.itest.day10.demo02;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    //重写抽象方法
    @Override
    public void methodAbs() {
        System.out.println("实现抽象方法，BBB");
    }

    @Override
    public void methodDef() {
        System.out.println("重写默认方法，BBB");
    }
}
