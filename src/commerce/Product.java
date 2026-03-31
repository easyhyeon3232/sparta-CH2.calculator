package commerce;

import java.util.Scanner;

public class Product {
    // 속성
    private String name;
    private String price;
    private String description;
    private int stock;

    Scanner sc = new Scanner(System.in);

    // 생성자
    public Product(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public void products() {
    }
}
