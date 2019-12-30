package cn.itest.day10.demo07;

/*
多态的格式：
父类名称 对象名 = new 子类名称();
或者
接口名称 对象名 = new 实现类名称();
 */
public class Demo07Multi {
    public static void main(String[] args) {

        //使用多态的写法
        Fu multi = new Zi();
        multi.method();
        multi.methodSpe();
    }

}
