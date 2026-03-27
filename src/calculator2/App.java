package calculator2;

import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        do {
            try {
                cal.Start();
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 숫자를 입력해주세요");
            }
        } while (cal.checkContinue());
    }
}
