package commerce;

import java.util.ArrayList;
import java.util.List;

// Product 클래스를 관리하는 클래스
public class Category {
    // 속성
    private List<Product> products;
    List<Product> list = new ArrayList<>();
    private String name;

    public Category(String name) {
        this.name = name;
    }
// 생성자


    // 기능
    public void addProduct(Product product) {

    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getList() {
        return list;
    }

    public String getName() {
        return name;
    }
}
