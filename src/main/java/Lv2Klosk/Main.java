package Lv2Klosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //햄버거 메뉴 리스트 생성
        List<MenuItem> menuItems = new ArrayList<>();

        //햄버거 메뉴 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKE SHACK MENU ]");

            //메뉴출력
            int index = 1;
            for (MenuItem menu : menuItems) {
                System.out.printf("%d. %s  | W %.1f | %s\n",
                        index++, menu.getName(), menu.getPrice(), menu.getDescription());
            }

            System.out.print("원하는 메뉴(1~4)를 선택하세요(0을 선택하면 종료됩니다.) :");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if (choice >= 1 && choice <= menuItems.size()) {
                //menuItems의 인덱스는 0부터 시작하므로 choice에 1을 입력하면 -1해서 0부터 받아옴
                MenuItem selected = menuItems.get(choice - 1);
                System.out.printf("%s를 선택하셨습니다.  W %.1f\n", selected.getName(), selected.getPrice());

            }else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
