package user;

// RegularUser .java
public class RegularUser  extends User {
    @Override
    public double getPrice(double basePrice) {
        return basePrice; // 全价
    }
}