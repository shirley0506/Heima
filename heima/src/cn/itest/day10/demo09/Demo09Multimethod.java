package cn.itest.day10.demo09;

/*
多态中成员方法的使用
看创建实例时，new的是谁，优先使用，无则向上

口诀：
调用成员方法：编译看左边，运行看右边
调用成员变量：编译看左边，运行看左边
 */

public class Demo09Multimethod {

    public static void main(String[] args) {
        Fu multimethod = new Zi();
        multimethod.methodC();
//        multimethod.methodB();  //编译看左边，父类中没有methodB()方法，导致编译失败
    }
}
