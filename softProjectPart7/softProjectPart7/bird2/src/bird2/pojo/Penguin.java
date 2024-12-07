package bird2.pojo;

import bird2.fly.FlyBehavior;
import bird2.swim.SwimBehavior;

// Penguin.java
public class Penguin extends Bird {
    public Penguin(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.behavior = flyBehavior; // 设置 behavior 字段
        this.swimBehavior = swimBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是一只企鹅。");
    }

    public void performSwim() {
        swimBehavior.swim();
    }
}