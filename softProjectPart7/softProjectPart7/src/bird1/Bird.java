package bird2;

public abstract class Bird {
    protected BirdBehavior behavior;

    public Bird(BirdBehavior behavior) {
        this.behavior = behavior;
    }

    public abstract void display();

    public void performFly() {
        behavior.fly();
    }

}
