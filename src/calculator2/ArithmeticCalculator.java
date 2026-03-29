package calculator2;

import java.util.ArrayList;
import java.util.List;

enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    // 속성
    private final char symbol;

    // 생성자
    OperatorType(char s) {
        this.symbol = s;
    }

    //기능
    public static OperatorType fromSymbol(char symbol) {
        return switch (symbol) {
            case '+' -> PLUS;
            case '-' -> MINUS;
            case '*' -> MULTIPLY;
            case '/' -> DIVIDE;
            default -> null;
        };
    }


    // Getter
    public char getSymbol() {
        return symbol;
    }
}

// <T extends Number> : T는 숫자 종류라면 무엇이든 가능하다는 제한
public class ArithmeticCalculator<T extends Number> {


    // 속성
    // 결과값들을 T 타입의 리스트로 저장
    private List<Double> results = new ArrayList<>();

    // 생성자
//    public ArithmeticCalculator() {
//        this.result = result;
//    }

    // 기능
    // 사칙연산 수행
    public double calculate(T num1, T num2, OperatorType op) {
        // 입력을 더블로 받아서 계산하면 정수, 실수 모두 커버 가능
        double result = 0;
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        switch (op) {
            case PLUS:
                result = n1 + n2;
                break;
            case MINUS:
                result = n1 - n2;
                break;
            case MULTIPLY:
                result = n1 * n2;
                break;
            case DIVIDE:
                result = n1 / n2;
        }
        results.add(result);
        return result;
    }

    public List<Double> getResult() {
        return this.results;
    }

    public void removeResult() {
        this.results.remove(0);
    }
}
