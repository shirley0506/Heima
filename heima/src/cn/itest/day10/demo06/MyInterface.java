package cn.itest.day10.demo06;

public interface MyInterface {
    public default void method() {
        System.out.println("接口默认方法");
    }


}
