package commerce;

// 개별 상품 정보를 가지는 클래스
public class Product {
    // 속성
    private String name;
    private int price;
    private String description;
    private int stock;

    // 생성자
    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }


    @Override
    // 객체 출력 시 주소값 대신 상품의 상세 정보를 문자열로 반환하기 위한 메서드
    public String toString() {
        return name + " | " + String.format("%d", price) + " | " + description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
