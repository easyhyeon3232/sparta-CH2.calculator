package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 프로그램 비즈니스 로직 클래스
// 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스
public class CommerceSystem {

    // 속성 - private TIL
    private List<Category> category = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);


    // 생성자
    public CommerceSystem() {

    }


    // 기능


    Category cate = new Category();
    Product p1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 50);
    Product p2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 40);
    Product p3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30);
    Product p4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20);
    Category.add();
        Category.add(p2);
        list.add(p3);
        list.add(p4);

    Category category = new Category(list);

    public void start() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                // String.format ("%d") : 숫자에 자동으로 "," 찍어주는 기능.
                System.out.println((i + 1) + "." + p.getName() + " | " + String.format("%,d", p.getPrice()) + " | " + p.getDescription());
            }
            System.out.println("0. 종료      |  프로그램 종료 ");
            int input = sc.nextInt();
            if (input == 0) {
                System.out.println("커머스 프랫폼을 종료합니다.");
                return;
            } else if (input > 0 && input <= products.size()) {
                Product readProduct = products.get(input - 1);
                System.out.println(input + "." + readProduct);
                System.out.println("=================================================");
            }
        }
    }
}
