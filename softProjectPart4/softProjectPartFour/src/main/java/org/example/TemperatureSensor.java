package org.example;

import java.util.Random;

public class TemperatureSensor {
    public static final int MIN_TEMP = 20;
    public static final int MAX_TEMP = 100;
    private int currentTemperature;

    public TemperatureSensor() {
        currentTemperature = MIN_TEMP; // 初始化温度位置
    }

    public int getCurrentTemperature() {
        // 模拟温度变化
        Random rand = new Random();
        currentTemperature += rand.nextInt(3) - 1; // 随机波动
        return Math.max(MIN_TEMP, Math.min(currentTemperature, MAX_TEMP));
    }
}
