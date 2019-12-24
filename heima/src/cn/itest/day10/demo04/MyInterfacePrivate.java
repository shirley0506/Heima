package cn.itest.day10.demo04;

public interface MyInterfacePrivate {
    public default void methodDefaultA() {
        System.out.println("默认方法A");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//        methodPrivate();
    }

    public default void methodDefaultB() {
        System.out.println("默认方法B");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//        methodPrivate();
    }
/*
    private void methodPrivate() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

 */
}
