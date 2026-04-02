package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 프로그램 비즈니스 로직 클래스
 * 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스입니다.
 */
public class CommerceSystem {

    /**
     * 카테고리 목록을 저장하는 리스트
     */
    private List<Category> categoryList = new ArrayList();

    /**
     * 사용자 입력을 받기 위한 스캐너 객체
     */
    private Scanner sc = new Scanner(System.in);


    // 생성자


    /**
     * CommerceSystem 객체를 생성하고 초기 데이터를 세팅합니다.
     * 전자제품, 의류, 식품 카테고리와 각 기본 상품들을 생성하여 등록합니다.
     */
    public CommerceSystem() {

        // 전자제품 카테고리 생성 및 상품 추가
        Category electronics = new Category("전자제품");
        electronics.addProduct(new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 50));
        electronics.addProduct(new Product("iphone 15", 1350000, "apple의 최신 스마트폰", 30));
        electronics.addProduct(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 35));
        electronics.addProduct(new Product("AirPods pro", 350000, "노이즈 캔슬링 무선 이어폰", 35));

        // 의류 카테고리 생성 및 상품 추가
        Category clothing = new Category("의류");
        clothing.addProduct(new Product("노스페이스 바람막이", 1200000, "겨울용 잠바", 13));
        clothing.addProduct(new Product("나이키 운동화", 320000, "스포츠 신발", 28));
        clothing.addProduct(new Product("아디다스 티셔츠", 235000, "캐쥬얼 티셔츠", 76));
        clothing.addProduct(new Product("자라 바지", 56000, "스타일 바지", 187));

        // 식품 카테고리 생성 및 상품 추가
        Category food = new Category("식품");
        food.addProduct(new Product("신라면", 1500, "매콤한 라면", 200));
        food.addProduct(new Product("참이슬", 1700, "소주", 130));
        food.addProduct(new Product("바나나 우유", 1200, "빙그레맛 우유", 150));
        food.addProduct(new Product("하겐다즈", 8800, "프리미엄 아이스크림", 50));

        // 카테고리 리스트에 추가
        categoryList.add(electronics);
        categoryList.add(clothing);
        categoryList.add(food);
    }


    // 기능

    /**
     * 메인 메뉴인 실시간 커머스 플랫폼의 카테고리 목록을 화면에 출력합니다.
     * 등록된 모든 카테고리 이름을 번화와 함께 표시하며, 종료 옵션을 포함합니다.
     */
    public void printMainMenu() {
        System.out.println("[ 실시간 커머스 플랫폼 ]");
        for (int i = 0; i < categoryList.size(); i++) {
            Category getCategory = categoryList.get(i);
            System.out.println((i + 1) + ". " + getCategory.getCategoryName());
        }
        System.out.println("0. 종료  |  프로그램 종료 ");
    }

    /**
     * 선택된 카테고리에 포함된 전체 상품 목록을 화면에 출력합니다.
     * @param category 상품 목록을 출력할 대상 카테고리 객체
     */
    public void printProductList(Category category) {
        System.out.println("[ " + category.getCategoryName() + " 카테고리 ]");
        for (int i = 0; i < category.getProductList().size(); i++) {
            Product product = category.getProductList().get(i);
            System.out.println((i + 1) + ". " + product);
        }
        System.out.println("0. 뒤로가기");
    }

    /**
     * 특정 카테고리 내에서 사용자가 선택한 특정 상품의 상세 정보를 출력합니다.
     * @param category 상품을 찾을 카테고리 객체
     * @param i 사용자가 입력한 상품 번호 (1부터 시작)
     */
    public void printProduct(Category category, int i) {
        i -= 1;
        if(i < category.getProductList().size()) {
            Product product = category.getProductList().get(i);
            System.out.println((i + 1) + ". " + product);
            // 줄바꿈 역할
            System.out.println();
        }
    }

    /**
     * 실시간 커머스 플랫폼의 메인 루프를 시작합니다.
     * 메뉴 출력, 카테고리 선태, 상품 선택 및 상세 정보 표시 과정을 반복하며
     * 사용자가 0을 입력할 경우 프로그램을 종료하거나 이전 메뉴로 돌아갑니다.
     */
    public void start() {
        while (true) {
            int productInput;
            int input;
            printMainMenu();
            // 각 카테고리 제품 리스트

            input = sc.nextInt();
            if (input == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                return;
            }

            if (input > 0 && input <= categoryList.size()) {
                Category readProduct = categoryList.get(input - 1);
                printProductList(readProduct);
                productInput = sc.nextInt();
                if(productInput == 0) continue;

                if(productInput > 0 && productInput <= readProduct.getProductList().size()) {
                    printProduct(readProduct, productInput);
                } else {
                    System.out.println("잘못된 상품입니다.");
                }
            }

        }
    }
}


