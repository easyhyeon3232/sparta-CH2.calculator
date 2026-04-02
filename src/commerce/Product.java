package commerce;

/**
 * 개별 상품의 정보를 관리하는 클래스입니다.
 * 상품명, 가격, 설명, 재고 등의 속성을 포함합니다.
 */
public class Product {
    // 속성
    private String name;
    private int price;
    private String description;
    private int stock;

    // 생성자

    /**
     * 새로운 상품 객체를 생성합니다.
     * @param name 상품명
     * @param price 상품 가격
     * @param description 상품 설명
     * @param stock 재고 수량
     */
    public Product(String name, int price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    /**
     * @return 등록된 상품명을 반환합니다. (String)
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return 등록된 상품 가격을 반환합니다. (int)
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * @return 등록된 상품 설명을 반환합니다. (String)
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @return 재고 수량을 반환합니다. (int)
     */
    public int getStock() {
        return this.stock;
    }


    /**
     * 상품 객체를 주소값 대신 문자열 형태로 변환합니다.
     * 상품명, 상품 가격, 설명 형식으로 반환합니다.
     * @return 상품의 정보 문자열 (String)
     */
    @Override
    // 객체 출력 시 주소값 대신 상품의 상세 정보를 문자열로 반환하기 위한 메서드
    public String toString() {
        // %,15d : 15칸 확보, 오른쪽 정렬, 3자리마다 콤마 추가
        // %-10s : 이름(10칸 왼쪽 정렬  / %12d : 가격 (12칸 오른쪽 정렬) / %s : 설명
        return String.format("%-15s | %,12d원 | %s", name, price, description);
    }
}
