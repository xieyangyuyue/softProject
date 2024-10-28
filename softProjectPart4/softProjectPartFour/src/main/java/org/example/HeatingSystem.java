// HeatingSystem.java
public class HeatingSystem {
    private State currentState;
    private boolean hasWater; // 表示水箱中是否有水

    public HeatingSystem() {
        this.currentState = new InitialState();
        this.hasWater = true; // 假设系统初始化时有水
    }

    public void setState(State state) {
        this.currentState = state;
        this.currentState.handleAction(this);
    }

    public boolean hasWater() {
        return hasWater;
    }

    public void setWaterAvailability(boolean hasWater) {
        this.hasWater = hasWater;
    }
}
