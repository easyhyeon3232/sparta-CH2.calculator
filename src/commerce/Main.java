package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        Product p1 = new Product("Galaxy S25", "1,200,000원", "최신 안드로이드 스마트폰");
        Product p2 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰");
        Product p3 = new Product("MacBook Pro", "2,400,000원", "M3 칩셋이 탑재된 노트북");
        Product p4 = new Product("AirPods Pro", "350,000원", "노이즈 캔슬링 무선 이어폰");

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.println((i + 1) + "." + p.getName() + " | " + p.getPrice() + " | " + p.getDescription());
            }
            System.out.println("0. 종료      |  프로그램 종료 ");
            int input = sc.nextInt();
            switch(input) {
                case 0:
                    return;
                case 1, 2, 3, 4:
                    System.out.println("이 부분은 내일 하자!");
                    break;

            }
        }
    }
}
