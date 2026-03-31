package calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// <T extends Number> : T는 숫자 종류라면 무엇이든 가능하다는 제한
public class ArithmeticCalculator {

    private List<Double> resultsList = new ArrayList<>();

    // 사칙연산 수행
    public <T extends Number, S extends Number> double calculate(T num1, S num2, OperatorType op) {
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
        resultsList.add(result);
        return result;
    }

    public List<Double> getResultList() {
        return this.resultsList;
    }

    public void removeResult() {
        this.resultsList.remove(0);
    }

    public List<Double> getBigValue (double target) {
        return resultsList.stream()
                .filter(n -> n > target)
                .collect(Collectors.toList());

    }

    public Double getBigNumber () {
        return resultsList.stream()
                // Double::campareTo :  더블 클래스에 있는 숫자 비교 기능(campareTo)을 가져다 쓰갰다.
                // 람다식 : (a, b) -> a.campareTo(b)
                .max(Double::compareTo)
                // 리스트안에 비어있을 경우 예외를 던져라
                .orElseThrow(() -> new IllegalArgumentException("데이터가 비어있어 최댓값을 구할 수 없습니다."));
    }

    // 중복되는 요소들을 제거하고 새로운 스트림 반환
    public List<Double> getDistinct() {
         return resultsList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}