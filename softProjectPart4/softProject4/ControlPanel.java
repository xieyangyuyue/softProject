import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ControlPanel {
    private static final String CORRECT_PASSWORD = "1234"; // 设置正确的密码
    private static final int MAX_ATTEMPTS = 3; // 最大尝试次数
    private static final int PASSWORD_LENGTH = 4; // 密码长度
    private int attemptCount = 0; // 当前尝试次数
    private boolean isLocked = false; // 控制面板是否被锁定
    private Timer lockTimer; // 定时器用于锁定

    public void inputPassword() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (isLocked) {
                System.out.println("控制面板已锁定，请等待解锁...");
                continue;
            }

            System.out.print("请输入密码：");
            String inputPassword = scanner.nextLine();

            if (inputPassword.length() != PASSWORD_LENGTH) {
                System.out.println("密码长度不正确，请输入4位密码。");
                continue;
            }

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("密码正确，进入系统功能选择状态。");
                // 这里可以调用进入功能选择的方法
                break;
            } else {
                attemptCount++;
                System.out.println("密码错误！");

                if (attemptCount >= MAX_ATTEMPTS) {
                    lockControlPanel();
                }
            }
        }

        scanner.close();
    }

    private void lockControlPanel() {
        System.out.println("错误次数达到上限，控制面板已锁定 120 秒。");
        isLocked = true;

        // 使用定时器在 120 秒后解锁
        lockTimer = new Timer();
        lockTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isLocked = false;
                attemptCount = 0; // 重置尝试次数
                System.out.println("控制面板已解锁，可以重新输入密码。");
            }
        }, 120000); // 120000 毫秒 = 120 秒
    }

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.inputPassword();
    }
}
