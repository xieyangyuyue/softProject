package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerManager {
    private Timer timer;
    private TankController tankController;

    public TimerManager(TankController tankController) {
        this.tankController = tankController;
        this.timer = new Timer();
    }

    public void startTimer() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                checkTimeAndAutoShutdown();
            }
        }, 0, 3600000); // 每小时检查一次
    }

    private void checkTimeAndAutoShutdown() {
        int currentHour = simulateTime();
        if (currentHour == 23) {
            tankController.shutdown(); // 23点关闭
        } else if (currentHour == 7) {
            tankController.activate(); // 7点激活
        }
    }

    public void stopTimer() {
        timer.cancel();
    }

    private int simulateTime() {
        return (int) (Math.random() * 24); // 示例：随机生成时间（0-23）
    }
}
