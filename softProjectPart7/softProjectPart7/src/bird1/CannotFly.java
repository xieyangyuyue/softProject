package bird1;

// CannotFly.java
public class CannotFly implements BirdBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
