package cn.itest.day09.demo01;

import java.util.ArrayList;

public class FaHongBao {
    public static void main(String[] args) {
        //创建管理员、普通成员变量实例
        Admin superadmin = new Admin("群主",1000);
        NormalUsers memberA = new NormalUsers("张三", 5);
        NormalUsers memberB = new NormalUsers("李四", 0);
        NormalUsers memberC = new NormalUsers("王二", 12);

        //第一次打印，管理员、普通成员在开始时各自的余额
        superadmin.show();
        memberA.show();
        memberB.show();
        memberC.show();
        System.out.println("============================");

        //管理员开始发红包
        ArrayList<Integer> list = superadmin.send(100, 3);
        System.out.println(list);
        //普通成员收红包
        memberA.receive(list);
        memberB.receive(list);
        memberC.receive(list);

        //第二次打印，管理员、普通成员在开始时各自的余额
        superadmin.show();
        memberA.show();
        memberB.show();
        memberC.show();


    }
}
