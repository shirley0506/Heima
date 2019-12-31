package cn.itest.day11.demo02;

public class Outer {

    int num = 10;

    public class Inner {
        int num = 20;
        public void method() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }

    //创建成员方法，调用内部类
    public void method() {
        new Inner().method();

    }

}
