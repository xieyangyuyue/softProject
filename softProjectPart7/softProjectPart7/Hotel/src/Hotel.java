import user.User;

// Hotel.java
class Hotel {
    private double basePrice;

    public Hotel(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice(User user) {
        return user.getPrice(basePrice);
    }
}
