package calculator2;

import calculator.Calculator;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            OperatorType op;
            double num1;
            double num2;
            try {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                num1 = sc.nextDouble();
                if (num1 < 0) {
                    System.out.println("음수를 입력할 수 없습니다.");
                    continue;
                }

                while (true) {
                    // + - * /로 받아야 하냐 아니면 PLUS MINUS로 받아야 할까?
                    System.out.print("사칙연산(+ - * /)을 입력하세요 : ");

                    // + - * / 로 입력받을 때
                    char input = sc.next().charAt(0);
                    op = OperatorType.fromSymbol(input);

                    if (op != null) {
                        System.out.println("input = " + input);
                        System.out.println("op = " + op);
                        break;
                    }
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                }

                    while (true) {
                        System.out.print("두 번째 숫자를 입력하세요 : ");
                        num2 = sc.nextDouble();
                        if (num2 < 0) {
                            System.out.println("음수를 입력할 수 없습니다.");
                            continue;
                        }
                        if (op == OperatorType.DIVIDE && num2 == 0) {
                            System.out.println("나눗셈 분모는 0으로 나눌 수 없습니다.");
                            continue;
                        }
                        break;
                    }
                    double result = cal.calculate(num1, num2, op);
                    System.out.println("result = " + result);
                    System.out.println("결과 : " + cal.getResult());


                } catch(InputMismatchException e){
                    System.out.println("잘못 입력하셨습니다. 처음부터 다시 입력해주세요..");
                    sc.nextLine();
                    continue;
                }

                while (true) {
                    sc.nextLine();
                    System.out.print("[yes] 계속 / [exit] 종료 / [remove] 삭제 : ");
                    String command = sc.nextLine();
                    if ("remove".equalsIgnoreCase(command)) {
                        cal.removeResult();
                        System.out.println("삭제한 계산 기록 : " + cal.getResult());
                        continue;
                    }

                    if ("get".equalsIgnoreCase(command)) {
                        System.out.print("입력한 숫자보다 큰 값들 조회 : ");
                        double input = sc.nextDouble();
                        cal.getBigValue(input);
                        System.out.println("input = " + cal.getBigValue(input));
                        continue;
                    }

                    if ("yes".equalsIgnoreCase(command)) {
                    } else if ("exit".equalsIgnoreCase(command)) {
                        return;
                    } else {
                        System.out.println("잘못 입력하셨습니다. [yes] 계속 / [exit] 종료 / [remove] 삭제");
                        continue;
                    }
                    break;
                }
            }
        }
    }
