package cn.itest.day10.demo03;

public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误调用静态方法
//        impl.methoStatic();

        MyInterfaceStatic.staticMethod();
    }
}
