package Lv5kiosk;
import java.util.List;

public class Menu1 {
    private final String categoryName;         // 카테고리 이름
    private final List<MenuItem4> menuItems;    // 카테고리에 속한 메뉴 아이템 리스트

    // 생성자: 카테고리명과 메뉴 아이템 리스트를 초기화
    public Menu1(String categoryName, List<MenuItem4> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 아이템 리스트 반환
    public List<MenuItem4> getMenuItems() {
        return menuItems;
    }
    //메뉴 아이템 리스트를 번호와 함께 출력하는 메서드
    //각 메뉴 이름, 가격, 설명을 보기 쉽게 출력함
    public void printMenuItems() {
        System.out.println("[" + categoryName + " 메뉴]");
        int index = 1;
        for (MenuItem4 item : menuItems) {
            System.out.printf("%d. %s  | W %.1f | %s\n",
                    index++, item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
