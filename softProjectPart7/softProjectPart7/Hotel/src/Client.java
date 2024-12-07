 import user.GoldCardUser;
import user.RegularUser;
import user.SilverCardUser;
import user.User;

// Client.java
public class Client {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(1000); // 基础房价 1000

        User regularUser  = new RegularUser();
        User goldCardUser  = new GoldCardUser();
        User silverCardUser  = new SilverCardUser();

        System.out.println("普通用户价格: " + hotel.calculatePrice(regularUser )); // 1000
        System.out.println("金卡用户价格: " + hotel.calculatePrice(goldCardUser )); // 800
        System.out.println("银卡用户价格: " + hotel.calculatePrice(silverCardUser )); // 900
    }
}
