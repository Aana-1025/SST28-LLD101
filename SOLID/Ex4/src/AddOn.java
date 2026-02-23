public enum AddOn {

    LAUNDRY(500),
    MESS(2500),
    WIFI(300);

    private final double cost;

    AddOn(double cost) {
        this.cost = cost;
    }

    public Money monthlyCost() {
        return new Money(cost);
    }
}