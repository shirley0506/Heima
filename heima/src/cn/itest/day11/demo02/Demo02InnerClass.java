package cn.itest.day11.demo02;

public class Demo02InnerClass {
    public static void main(String[] args) {
       /*间接调用
       *    通过外部内的成员方法，调用内部类
       */
       Outer outer = new Outer();
       outer.method();


        /*调用外部类的内部类----  直接调用
        Outer.Inner inner = new Outer().new Inner();
        inner.method();

         */
    }
}
