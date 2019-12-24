package cn.itest.day09.demo01;

public class Member {
    private String name;
    private int money;

    public Member(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("我是 " + name + ", 我有" + money + "rmb");
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
}
