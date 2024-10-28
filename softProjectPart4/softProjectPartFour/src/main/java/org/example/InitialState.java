// InitialState.java
public class InitialState implements State {
    public void handleAction(HeatingSystem system) {
        System.out.println("系统初始化...");
        system.setState(new SleepState()); // 初始化直接进入休眠状态
    }
}
