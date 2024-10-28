// Temperature100State.java
public class Temperature100State implements State {
    public void handleAction(HeatingSystem system) {
        System.out.println("水箱温度达到100°，保持当前状态，准备维修。");
        system.setState(new InitialState()); // 返回初始状态进行维修
    }
}
