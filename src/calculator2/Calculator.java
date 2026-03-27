package calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    // 속성
    private ArrayList<Integer> results;
    Scanner sc;


    // 생성자
    Calculator() {
        this.results = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    // 기능
    // 입력받는 메서드
    public void Start() {
        while (true) {
            char op;
            int num1;
            int num2;
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("음수를 입력할 수 없습니다.");
                continue;
            }

            while (true) {
                System.out.print("사칙연산(+ - * /)을 입력하세요 : ");
                op = sc.next().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    break;
                }
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요 : ");
                num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.println("음수를 입력할 수 없습니다.");
                    continue;
                }
                if (op == '/' && num2 == 0) {
                    System.out.println("나눗셈 분모는 0으로 나눌 수 없습니다.");
                    continue;
                }
                break;
            }
            System.out.println("결과 : " + calculate(num1, num2, op));
        }
    }

    // 사칙연산 수행
    public int calculate(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
        }
        results.add(result);
        return result;
    }

    // 질문 메서드
    public boolean checkContinue() {
        while (true) {
            sc.nextLine();
            System.out.print("[yes] 계속 / [exit] 종료 : ");
            String command = sc.nextLine();
            if ("yes".equalsIgnoreCase(command)) {
                return true;
            }
            if ("exit".equalsIgnoreCase(command)) {
                return false;
            }
            System.out.println("잘못 입력하셨습니다. [yes] 계속 / [exit] 종료");
        }
    }
}
