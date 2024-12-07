package user;

// SilverCardUser .java
public class SilverCardUser  extends User {
    @Override
    public double getPrice(double basePrice) {
        return basePrice * 0.9; // 9 折
    }
}