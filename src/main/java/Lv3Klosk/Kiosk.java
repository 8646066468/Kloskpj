package Lv3Klosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<MenuItem2> menuItems;

    public Kiosk(List<MenuItem2> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKE SHACK MENU ]");
            int index = 1;
            for (MenuItem2 menu : menuItems) {
                System.out.printf("%d. %s  | W %.1f | %s\n",
                        index++, menu.getName(), menu.getPrice(), menu.getDescription());
            }
            System.out.print("원하는 메뉴(1~4)를 선택하세요(0을 선택하면 종료됩니다.) :");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice >= 1 && choice <= menuItems.size()) {
                //menuItems의 인덱스는 0부터 시작하므로 choice에 1을 입력하면 -1해서 0부터 받아옴
                MenuItem2 selected = menuItems.get(choice - 1);
                System.out.printf("%s를 선택하셨습니다.  W %.1f\n", selected.getName(), selected.getPrice());

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        sc.close();
    }
}