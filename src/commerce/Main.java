package commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        Product p1 = new Product("Galaxy S25", "1,200,000원", "최신 안드로이드 스마트폰");
        Product p2 = new Product("iPhone 16", "1,350,000원", "Apple의 최신 스마트폰");
        Product p3 = new Product("MacBook Pro", "2,400,000원", "M3 칩셋이 탑재된 노트북");
        Product p4 = new Product("AirPods Pro", "350,000원", "노이즈 캔슬링 무선 이어폰");

        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p3);
        productsList.add(p4);
    }
}
