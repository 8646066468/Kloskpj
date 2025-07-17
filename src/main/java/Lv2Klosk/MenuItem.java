package Lv2Klosk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    MenuItem(String name, double price, String description) {
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
