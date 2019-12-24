package cn.itest.day10.demo04;

public class MyInterfacePrivateImplA implements MyInterfacePrivate {
    public void methodAnother() {
        //这是错误写法
        //不能直接访问私有方法
//        methodPrivat();
    }
}
