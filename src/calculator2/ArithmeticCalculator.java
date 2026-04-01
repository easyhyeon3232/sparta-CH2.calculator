package calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 다양한 숫자 타입의 사칙연산을 수행하고 결과를 리스트에 저장하여 관리하는 계산기 클래스입니다.
 */
public class ArithmeticCalculator {

    /**
     * 연산 수행 결과 값들을 순차적으로 저장하는 리스트
     */
    private List<Double> resultsList = new ArrayList<>();

    /**
     * 입력받은 두 숫자와 연산자를 사용하여 계산을 수행합니다.
     * 계산된 결과를 리스트에 저장하며, 해당 결과값을 반환합니다.
     * @param num1 입력받는 첫 번째 숫자 (T)
     * @param num2 입력받은 두 번째 숫자 (S)
     * @param operator 수행할 연산 종류 (OperatorType)
     * @return 계산된 결과 (double)
     * @param <T> Number를 상속받는 첫 번째 숫자 타입
     * @param <S> Number를 상속받는 두 번째 숫자 타입
     */
    public <T extends Number, S extends Number> double calculate(T num1, S num2, OperatorType operator) {
        // 입력을 더블로 받아서 계산하면 정수, 실수 모두 커버 가능
        double result = 0;
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        switch (operator) {
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

    /**
     * 캡슐화된 결과 리스트를 외부에서 사용할 수 있게 반환합니다.
     * @return 계산된 전체 결과 리스트 (List<Double>)
     */
    public List<Double> getResultList() {
        return this.resultsList;
    }

    /**
     * 리스트에 가장 먼저 저장된(가장 오래된) 결과를 삭제합니다.
     */
    public void removeResult() {
        this.resultsList.remove(0);
    }

    /**
     * 결과 리스트에서 입력받은 기준값보다 큰 요소들만 필터링하여 리스트로 반환합니다.
     * @param target 비교의 기준이 되는 값(double)
     * @return 기준값보다 큰 요소들을 담은 리스트 (List<Double>)
     */
    public List<Double> getBigValue (double target) {
        return resultsList.stream()
                .filter(n -> n > target)
                .collect(Collectors.toList());

    }

    /**
     * 결과 리스트에서 가장 큰 값을 찾아 반환합니다.
     * @return 검색된 최댓값(Double)
     * @throws IllegalArgumentException 리스트가 비어있어 최댓값을 결정할 수 없는 경우 발생
     */
    public Double getMax() {
        return resultsList.stream()
                // Double::campareTo :  더블 클래스에 있는 숫자 비교 기능(campareTo)을 가져다 쓰갰다.
                // 람다식 : (a, b) -> a.campareTo(b)
                .max(Double::compareTo)
                // 리스트안에 비어있을 경우 예외를 던져라
                .orElseThrow(() -> new IllegalArgumentException("데이터가 비어있어 최댓값을 구할 수 없습니다."));
    }

    /**
     * 결과 리스트에서 중복된 요소를 제거한 뒤 새로운 리스트로 반환합니다.
     * @return 중복이 제거된 숫자 리스트 (List<Double>)
     */
    public List<Double> getDistinct() {
        return resultsList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}