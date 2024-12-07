package bird2;


import bird2.fly.FlyBehavior;
import bird2.fly.UnableFly;
import bird2.pojo.Bird;
import bird2.pojo.Eagle;
import bird2.pojo.Penguin;
import bird2.swim.AbleSwim;
import bird2.swim.SwimBehavior;
import bird2.swim.UnableSwim;

public class Client {
    public static void main(String[] args) {
        FlyBehavior canFly = new UnableFly();
        FlyBehavior unableFly = new UnableFly();
        SwimBehavior ableSwim = new AbleSwim();
        SwimBehavior unableSwim = new UnableSwim();

        Bird eagle = new Eagle(canFly, unableSwim);
        Bird penguin = new Penguin(unableFly, ableSwim);

        // 测试老鹰
        eagle.display();
        eagle.performFly();
        eagle.performSwim();

        // 测试企鹅
        penguin.display();
        penguin.performFly();
        penguin.performSwim();
    }
}
