// Temperature20State.java
public class Temperature20State implements State {
    public void handleAction(HeatingSystem system) {
        System.out.println("温度低于20°，检查水量。");
        if (system.hasWater()) {
            System.out.println("有水，进入加热状态。");
            system.setState(new HeatingState());
        } else {
            System.out.println("无水, 不加热。");
        }
    }
}
