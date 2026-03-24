package calculator;

import java.util.ArrayList;

public class Calculator {

    // 속성
    // result 값 저장
    private final ArrayList<Integer> resultList = new ArrayList<>();


    // 생성자
    Calculator() {
    }

    // 기능
    // 사칙연산 기능
    public int calculate(int num1, int num2, char sen) {

        int result = 0;

        switch (sen) {
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
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
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
    public void removeList() {
        // 리스트안에 비어있으면?
        // resultList안에 있는 첫번째 값을 지운다.
        int remove = resultList.remove(0);
    }

    // setter 활용
    //public void setreslut(?) {

    }

}//class

