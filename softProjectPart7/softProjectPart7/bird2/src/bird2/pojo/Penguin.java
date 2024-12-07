package bird2;

// Penguin.java
public class Penguin extends Bird {
    public Penguin(BirdBehavior behavior) {
        super(behavior);
    }

    @Override
    public void display() {
        System.out.println("I am a Penguin.");
    }
}