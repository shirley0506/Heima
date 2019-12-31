package cn.itest.day11.demo03;

public class Outer {

    public void methodOuter() {
        class Inner{    //局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();  //在方法内，创建局部内部类实例
        inner.methodInner();    //再调用局部方法来调用局部内里类的方法
    }
}
