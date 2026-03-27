package calculator2;

import java.util.ArrayList;

public class Calculator {

    // 속성
    private ArrayList<Integer> results;


    // 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 기능
    public int calculate(int num1, int num2, char op){
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

}
