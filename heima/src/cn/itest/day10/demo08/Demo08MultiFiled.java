package cn.itest.day10.demo08;
/*
调用成员变量：
1. 直接调用：看创建实例 等式的左边，优先使用，无则向上找
格式：对象名.成员变量
2. 间接调用：看成员方法属于哪个类，优先使用，无则向上找
格式：通过调用成员方法，间接使用成员变量
 */
public class Demo08MultiFiled {
    public static void main(String[] args) {
        //使用多态的方法，父类引用指向子类对象
        Fu multifield = new Zi();
        System.out.println(multifield.num);  //直接调用，等式左边是父类，直接使用父类的变量
        System.out.println("===============");
        multifield.methodshow();    //间接调用，子类未覆盖重写，父类的方法，间接调用使用父类的变量
        System.out.println("================");
        multifield.methodshow();     //间接调用，子类覆盖重写，子类的方法，间接调用使用父类的变量
    }
}
