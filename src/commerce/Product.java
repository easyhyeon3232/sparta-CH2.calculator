package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    // 속성
    String[] name = {"Galaxy S25", "iPhone16", "MacBook Pro", "AirPods Pro"};
    String[] price = {"1,200,000원", "1,350,000원", "2,400,000원", "350,000원"};
    String[] description = {"최신 안드로이드 스마트폰", "Apple의 최신 스마트폰", "M3 칩셋이 탑재된 노트북", "노이즈 캔슬링 무선 이어폰"};
    int stock;
    List<Product> productsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 생성자

    // 기능
    public void products() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ] ");
            for (int i = 0; i < name.length; i++) {
                System.out.println((i + 1) + "." + name[i] + " | " + price[i] + " | " + description[i]);
            }
            System.out.println("0. 종료     | 프로그램 종료");
            int input = sc.nextInt();
            switch (input) {
                case 0:
                    System.out.println("커머스 플랫폼을 종료합니다.");
                    return;
                case 1, 2, 3:


            }
        }
    }
}
