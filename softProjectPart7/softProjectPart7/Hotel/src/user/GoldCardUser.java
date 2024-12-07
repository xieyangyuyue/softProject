package user;

// GoldCardUser .java
public class GoldCardUser  extends User {
    @Override
    public double getPrice(double basePrice) {
        return basePrice * 0.8; // 8 折
    }
}