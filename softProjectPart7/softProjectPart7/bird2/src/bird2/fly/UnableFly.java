package bird2.fly;

// UnableFly.java
public class UnableFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("扑腾几下飞不起来。");
    }

}
