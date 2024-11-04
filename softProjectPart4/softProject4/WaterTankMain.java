import java.util.Timer;
import java.util.TimerTask;

class WaterTank {
    private double temperature; // 当前温度
    private boolean hasWater; // 是否有水
    private boolean powerOn; // 继电器电源状态
    private boolean isBroken; // 水箱是否坏掉

    public WaterTank() {
        this.temperature = 20.0; // 初始温度
        this.hasWater = true; // 假设水箱有水
        this.powerOn = false; // 初始电源关闭
        this.isBroken = false; // 水箱初始状态为正常
    }

    public void updateTemperature() {
        if (powerOn && temperature < 100) {
            temperature += 1; // 每次调用加热1度
        }
        if (temperature >= 100) {
            powerOn = false; // 达到100度，断开电源
            System.out.println("水箱温度达到100度，断开电源。");
        }
    }

    public void checkAndHeat() {
        if (temperature < 20) {
            if (hasWater) {
                powerOn = true; // 打开电源
                System.out.println("温度低于20度，开始烧水。");
            } else {
                System.out.println("水箱中无水，无法烧水。");
            }
        }
    }

    public void repair() {
        isBroken = false; // 维修水箱
        System.out.println("水箱已维修。");
    }

    public void goToSleep() {
        powerOn = false; // 进入休眠状态
        System.out.println("水箱进入休眠状态。");
    }

    public void wakeUp() {
        System.out.println("水箱早上7点醒来，准备烧水。");
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}

public class WaterTankMain {
    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank();
        Timer timer = new Timer();

        // 模拟晚上11点断开电源
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                waterTank.goToSleep();
            }
        }, 0, 10000); // 每10秒模拟一次时间流逝

        // 模拟早上7点唤醒
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                waterTank.wakeUp();
                waterTank.checkAndHeat();
            }
        }, 60000); // 60秒后唤醒（模拟早上7点）

        // 模拟温度变化
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!waterTank.isBroken()) {
                    waterTank.updateTemperature();
                    System.out.println("当前温度: " + waterTank.getTemperature() + "°C");
                    waterTank.checkAndHeat();
                } else {
                    System.out.println("水箱坏掉，无法工作。");
                }
            }
        }, 0, 1000); // 每1秒更新一次温度
    }
}
