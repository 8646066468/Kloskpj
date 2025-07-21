package Lv4Klosk;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // 버거 메뉴 생성 및 각 메뉴 아이템 추가
        List<MenuItem3> burgerItems = new ArrayList<>();
        burgerItems.add(new MenuItem3("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem3("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem3("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem3("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 버거 메뉴 카테고리 생성, 이름과 메뉴 아이템 리스트 전달
        Menu burgerMenu = new Menu("Burgers", burgerItems);

        // 음료 메뉴 생성 및 각 메뉴 아이템 추가
        List<MenuItem3> drinks = new ArrayList<>();
        drinks.add(new MenuItem3("Cola", 1.5, "시원한 탄산음료"));
        drinks.add(new MenuItem3("Americano", 2.0, "진한 커피"));

        // 음료 메뉴 카테고리 생성
        Menu drinksMenu = new Menu("Drinks", drinks);

        // 디저트 메뉴 생성 및 각 메뉴 아이템 추가
        List<MenuItem3> desserts = new ArrayList<>();
        desserts.add(new MenuItem3("Shake", 3.5, "달콤한 밀크쉐이크"));
        desserts.add(new MenuItem3("Cookie", 1.8, "초코칩 쿠키"));

        // 디저트 메뉴 카테고리 생성
        Menu dessertsMenu = new Menu("Desserts", desserts);

        // 전체 메뉴 카테고리를 담을 리스트 생성 및 카테고리별 Menu 객체 추가
        List<Menu> allMenus = new ArrayList<>();
        allMenus.add(burgerMenu);
        allMenus.add(drinksMenu);
        allMenus.add(dessertsMenu);

        // Kiosk1 객체 생성하며 전체 메뉴 리스트 전달
        Kiosk1 kiosk = new Kiosk1(allMenus);

        // 키오스크 프로그램 실행 시작
        kiosk.start();
    }
}
