// Main.java
public class Main {
    public static void main(String[] args) {
        HeatingSystem heatingSystem = new HeatingSystem();
        heatingSystem.setState(new InitialState()); // 启动系统
    }
}
