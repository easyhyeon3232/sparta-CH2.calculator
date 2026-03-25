package calculator;

import java.util.ArrayList;

public class Calculator {

    // 속성
    // result 값 저장
    private ArrayList<Integer> resultList = new ArrayList<>();

    // 생성자
    Calculator() {
    }

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

    // setter 활용
    public void setResult(int index, int newValue) {
        // 라스트의 범위를 벗어나는지 확인
        if (index >= 0 && index < resultList.size()) {

            if (newValue >= 0) {
                this.resultList.set(index, newValue);
                System.out.println(index + "번 기록이 " + newValue + "(으)로 수정되었습니다.");
            } else {
                System.out.println("양수(0 포함)만 입력 가능합니다.");
            }
        } else {
            System.out.println("이 위치에는 수정할 수 있는 데이터가 없습니다.");
        }
    }

    // 삭제(첫 번째 결과값만)
    public void removeFirstList() {
        // resultList안에 있는 첫번째 값을 지운다.
        resultList.remove(0);
    }

}//class
