// SleepState.java
public class SleepState implements State {
    public void handleAction(HeatingSystem system) {
        System.out.println("夜间休眠状态，自动断电。");
        
        // 假设时间到了早上7点
        boolean isMorning = true; // 可以通过其他条件来判断是否早上
        if (isMorning) {
            system.setState(new Temperature20State());
        }
    }
}
