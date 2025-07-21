package Lv4Klosk;

public class MenuItem3 {
    private final String name;
    private final double price;
    private final String description;

    MenuItem3(String name, double price, String description) {
        this.name = name; //메뉴이름
        this.price = price; //메뉴 가격
        this.description = description; //메뉴 설명
    }
    //getter 메서드
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
