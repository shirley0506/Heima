package cn.itest.day09.demo01;

import java.util.ArrayList;

public class Admin extends Member {

    public Admin(String name, int money) {
        super(name, money);
    }

    /*
    管理员主要发红包，以下方法实现发红包
     */
    public ArrayList<Integer> send (int totalmoney, int counts) {
        //定义一个空集合，用来存储红包列表
        ArrayList<Integer> redpackages = new ArrayList<Integer>();
        //先获取管理员的余额
        int balance = super.getMoney();
        //先确保管理员的余额是否够发红包
        if ( balance < totalmoney ) {
            System.out.println("余额不足！");
            return redpackages;
        }

        //平分红包
        int avg = totalmoney / counts;
        int mod = totalmoney % counts;
        //塞红包
        for ( int i=0; i < counts-1; i++) {
            redpackages.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redpackages.add(last);
        //管理员剩余的钱
        super.setMoney(balance - totalmoney);
        return redpackages;
    }
}
