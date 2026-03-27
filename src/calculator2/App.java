package calculator2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        char op;
        String command;

        while (true) {
            try {
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
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                    }
                }
                while (true) {
                    System.out.print("두 번째 숫자를 입력하세요 : ");
                    num2 = sc.nextInt();
                    if (num2 < 0) {
                        System.out.println("음수를 입력할 수 없습니다.");
                        continue;
                    }
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 숫자를 입력해주세요");
                sc.nextLine();
                continue;
            }

            int result = cal.calculate(num1, num2, op);
            System.out.println("결과 : " + result);

            while (true) {
                sc.nextLine();
                System.out.print("[yes] 계속 / [exit] 종료 : ");
                command = sc.nextLine();
                switch (command) {
                    case "yes":
                        break;
                    case "exit":
                        return;
                    default:
                        System.out.println("잘못 입력하셨습니다. [yes] 계속 / [exit] 종료");
                        continue;
                }
                break;
            }
        }
    }
}
