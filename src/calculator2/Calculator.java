package calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    private List<Integer> results = new ArrayList<>();

    // 생성자

    // 기능
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

    public List<Integer> getResult() {
        return this.results;
    }

    public void removeResult() {
        this.results.remove(0);
    }
}
