package cn.itest.day10.demo02;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();   //实现类重写抽象方法，实例可调用
        a.methodDef();   //接口类的默认方法(JAVA 8) ，可直接调用

        System.out.println("=====================");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDef();

    }
}
