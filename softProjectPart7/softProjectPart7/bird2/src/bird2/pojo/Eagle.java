package bird2.pojo;

import bird2.fly.FlyBehavior;
import bird2.swim.SwimBehavior;

public class Eagle extends Bird {
    public Eagle(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.behavior = flyBehavior; // 设置 behavior 字段
        this.swimBehavior = swimBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是一只老鹰。");
    }

    public void performSwim() {
        swimBehavior.swim();
    }
}