package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 프로그램 비즈니스 로직 클래스
// 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스
public class CommerceSystem {

    // 속성 - private TIL
    List<Category> categoryList = new ArrayList();
    private Scanner sc = new Scanner(System.in);


    // 생성자


    public CommerceSystem() {

        Category electronics = new Category("전자제품");
        Product p1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 50);
        electronics.addProduct(new Product("ipone 16", 1350000, "apple의 최신 스마트폰",30));
        electronics.addProduct(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 35 ));
        electronics.addProduct(new Product("AirPods pro",350000, "노이즈 캔슬링 무선 이어폰", 35));

        Category clothing = new Category("의류");
        clothing.addProduct(new Product("노스페이스 잠바", 3200000,"겨울용 잠바", 13));
        clothing.addProduct(new Product("나이키 운동화",320000, "스포츠 신발",28));
        clothing.addProduct(new Product("아이다스 티셔츠",235000, "캐쥬얼 티셔츠",76));
        clothing.addProduct(new Product("무신사 바지",87000,"스타일 바지",187));

        Category food = new Category("식품");
        food.addProduct(new Product("신라면", 1500,"매콤한 라면",200));
        food.addProduct(new Product("참이슬",1700,"소주",130));
        food.addProduct(new Product("바나나 우유",1200,"빙그레맛 우유",150));
        food.addProduct(new Product("하겐다즈",8800,"프리미엄 아이스크림",50));

    }


    // 기능
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
