package bird2;

// UnableFly.java
public class UnableFly implements BirdBehavior {
    @Override
    public void fly() {
        System.out.println("扑腾几下飞不起来。");
    }

}
