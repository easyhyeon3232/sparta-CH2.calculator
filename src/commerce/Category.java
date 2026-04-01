package commerce;

import java.util.ArrayList;
import java.util.List;

// Product 클래스를 관리하는 클래스
public class Category {

    // 속성
    List<Product> productList = new ArrayList<>();
    private String name;

    // 생성자
    public Category(String name) {
        this.name = name;
    }
    // 기능

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void getCategoryName() {

    }
}
