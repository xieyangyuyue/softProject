package org.example;

public class TankController {
    private TimerManager timerManager;
    private Heater heater;
    private WaterSensor waterSensor;
    private TemperatureSensor temperatureSensor;

    public TankController() {
        this.timerManager = new TimerManager(this);
        this.heater = new Heater();
        this.waterSensor = new WaterSensor();
        this.temperatureSensor = new TemperatureSensor();
    }

    public void start() {
        timerManager.startTimer();
    }

    public void checkTemperature() {
        int currentTemp = temperatureSensor.getCurrentTemperature();
        if (currentTemp < TemperatureSensor.MIN_TEMP) {
            if (waterSensor.isWaterAvailable()) {
                heater.startHeating();
            } else {
                System.out.println("当前无水，不启动加热。");
            }
        } else if (currentTemp >= TemperatureSensor.MAX_TEMP) {
            heater.stopHeating();
        }
    }

    public void activate() {
        System.out.println("系统激活，开始温度检测...");
        checkTemperature();
    }

    public void shutdown() {
        System.out.println("系统进入休眠状态。");
        timerManager.stopTimer(); // 取消定时器
        heater.stopHeating(); // 确保加热器关闭
    }
}
