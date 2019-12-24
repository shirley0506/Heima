package cn.itest.day09.demo01;

import java.util.ArrayList;
import java.util.Random;

public class NormalUsers extends Member {
    public NormalUsers(String name, int money) {
        super(name, money);
    }

    /*
     普通成员实现的是收红包的功能
     普通成员1收到红包，就要从红包列表中删除一个元素
     */
    public void receive (ArrayList<Integer> redpackage) {
        //随机获取列表元素，实现随机获取红包
        int index = new Random().nextInt(redpackage.size());
        int delmoney = redpackage.remove(index);
        //普通成员的余额重置
        int money = super.getMoney() + delmoney;
        super.setMoney(money);

    }
}
