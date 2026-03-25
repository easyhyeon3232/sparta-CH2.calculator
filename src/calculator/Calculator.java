package calculator;

import java.util.ArrayList;

public class Calculator {

    // 속성
    // result 값 저장
    private ArrayList<Integer> resultList = new ArrayList<>();


    // 생성자
    Calculator() {
    }

    // 기능
    // 사칙연산 기능
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
                break;
        }
        // 결과값을 리스트에 저장을 하지만 반환은 하나의 결과만 보낸다.
        resultList.add(result);
        return result;
    }//calculate

    // getter 활용
    public ArrayList<Integer> getResultList() {
        return this.resultList;
    }

    // 삭제(첫 번째 결과값만)
    public void removeFirstList() {
        // 리스트안에 비어있으면?
        // resultList안에 있는 첫번째 값을 지운다.
        resultList.remove(0);
    }

}//class


// setter 활용
//    public void setReslut(ArrayList<Integer> allList) {
//        this.resultList = allList;
//    }