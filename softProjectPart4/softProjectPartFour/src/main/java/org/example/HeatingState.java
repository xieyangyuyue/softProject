// HeatingState.java
public class HeatingState implements State {
    private int temperature = 20; // 初始温度

    public void handleAction(HeatingSystem system) {
        System.out.println("水箱正在加热...");
        while (temperature < 100) {
            temperature += 20; // 假设加热速度
            System.out.println("当前温度: " + temperature + "°");
            if (!system.hasWater()) {
                System.out.println("水箱无水，停止加热。");
                system.setState(new Temperature20State());
                return; // 结束加热过程
            }
        }
        System.out.println("温度达到100°，自动断开电源。");
        system.setState(new Temperature100State());
    }
}
