package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Product p1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 50);
        Product p2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 40);
        Product p3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30);
        Product p4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        CommerceSystem commerceSystem = new CommerceSystem(list);
        commerceSystem.start();


    }
}
