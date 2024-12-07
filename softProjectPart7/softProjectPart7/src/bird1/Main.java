package bird2;

public class Main {
    public static void main(String[] args) {
        BirdBehavior nonFlyingBehavior = new CannotFly();
        Bird penguin = new Penguin(nonFlyingBehavior);


        penguin.display();
        penguin.performFly();
    }
}
