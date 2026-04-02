package commerce;

import java.util.ArrayList;
import java.util.List;

/**
 * 상품들을 분류하기 위한 카테고리 클래스입니다.
 * 전자제품, 의류, 식품 등 각 카테고리 내에 여러 Product를 포합합니다.
 */
public class Category {

    // 속성
    /** 해당 카테고리에 속한 상품들의 목록 */
    private List<Product> productList = new ArrayList<>();
    private String name;

    // 생성자

    /**
     * 새로운 카테고리 이름을 생성합니다.
     * @param name 카테고리 이름(전자제품, 의류, 식품)
     */
    public Category(String name) {
        this.name = name;
    }


    // 기능

    /**
     * 카테고리에 새로운 상품을 추가합니다.
     * @param product 추가할 상품 객체
     */
    public void addProduct(Product product) {
        productList.add(product);
    }

    /**
     * 카테고리의 이름을 반환합니다.
     * @return 카테고리 이름(String)
     */
    public String getCategoryName() {
        return this.name;
    }

    /**
     * 상품의 리스트를 반환합니다.
     * @return 상품의 리스트 (List<Product>)
     */
    public List<Product> getProductList(){
        return this.productList;
    }

    /**
     * 카테고리 이름을 주소값말고 문자열을 변환해 반환합니다.
     * @return
     */
    @Override
    public String toString() {
        return name;
    }
}
