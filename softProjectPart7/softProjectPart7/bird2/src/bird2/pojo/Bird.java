package bird2.pojo;

import bird2.fly.FlyBehavior;
import bird2.swim.SwimBehavior;

public abstract class Bird {
    protected FlyBehavior behavior;
    protected SwimBehavior swimBehavior;

    public abstract void display();

    public void performFly() {
        behavior.fly();
    }

    public void performSwim() {
    }
}
