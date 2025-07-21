package Lv2Klosk;

public class MenuItem1 {
    private String name;
    private double price;
    private String description;

    MenuItem1(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

}
