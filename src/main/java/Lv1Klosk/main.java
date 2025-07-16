package Lv1Klosk;

import java.util.Scanner;

// 시작 지점이 되는 클래스
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            System.out.print("원하는 메뉴를 선택하세요(0을 선택하면 종료됩니다.) :");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice == 1) {
                System.out.println("ShackBurger를 선택하셨습니다.  W 6.9");
            } else if (choice == 2) {
                System.out.println("SmokeShack를 선택하셨습니다.  W 8.9");
            } else if (choice == 3) {
                System.out.println("Cheeseburger를 선택하셨습니다.  W 6.9");
            } else if (choice == 4) {
                System.out.println("Hamburger를 선택하셨습니다.  W 5.4");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }

    }
}
