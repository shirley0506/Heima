package cn.itest.day11.demo02;

public class Body {     //外部类

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Heart{     //内部类
        //内部类的方法
        public void beat() {
            System.out.println("内部类的方法！");
        }
    }

    //外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法！");
    }
}
