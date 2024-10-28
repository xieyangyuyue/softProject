package org.example;

public class Heater {
    private boolean isHeating = false;

    public void startHeating() {
        isHeating = true;
        System.out.println("开始加热中...");
    }

    public void stopHeating() {
        isHeating = false;
        System.out.println("停止加热。");
    }
}
