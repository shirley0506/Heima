package cn.itest.day10.demo02;

public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //升级接口，添加默认方法
    public default void methodDef() {
        System.out.println("接口新增，添加默认方法");
    }

}
