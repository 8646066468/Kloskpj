package Lv4Klosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk1 {
    private final List<Menu> menus; // 관리하는 메뉴 카테고리 리스트

    // 생성자: 메뉴 카테고리 리스트를 받아 초기화
    public Kiosk1(List<Menu> menus) {
        this.menus = menus;
    }

    // 키오스크 실행 메서드
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 카테고리 메뉴 출력
            System.out.println("[ SHAKE SHACK 카테고리 메뉴 ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.print("카테고리 번호 선택(0을 누르면 종료됩니다): ");
            int categoryChoice = sc.nextInt();

            // 0 입력 시 프로그램 종료
            if (categoryChoice == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            // 잘못된 카테고리 번호 입력 시 안내 후 재입력 요청
            if (categoryChoice < 1 || categoryChoice > menus.size()) {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                continue;
            }

            // 선택한 카테고리 메뉴 가져오기 및 메뉴 아이템 출력
            Menu selectedMenu = menus.get(categoryChoice - 1);
            selectedMenu.printMenuItems();

            System.out.print("메뉴 번호 선택 (0: 뒤로가기): ");
            int itemChoice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            // 0 입력 시 카테고리 선택으로 돌아가기
            if (itemChoice == 0) {
                continue;
            }

            // 잘못된 메뉴 번호 입력 시 안내 후 재입력 요청
            if (itemChoice < 1 || itemChoice > selectedMenu.getMenuItems().size()) {
                System.out.println("잘못된 메뉴 번호입니다.");
                continue;
            }

            // 선택한 메뉴 아이템 가져오기 및 상세 정보 출력
            MenuItem3 selectedItem = selectedMenu.getMenuItems().get(itemChoice - 1);
            System.out.println("선택한 메뉴: "
                    + selectedItem.getName()
                    + " | 가격: W " + selectedItem.getPrice()
                    + " | 설명: " + selectedItem.getDescription());
        }
    }
}
