package calculator2;

import java.util.InputMismatchException;

import java.util.Scanner;

/**
 * 계산기 프로그램의 실행을 담당하는 메인 클래스
 * 사용자로부터 숫자와 연산 기호를 입력받아 계산을 수행합니다.
 * 계산 기록을 조회, 삭제, 기준값보다 큰 요소들 조회, 가장 큰 값 조회, 중복 요소 제거 기능을 제공합니다.
 */
public class App {
    public static void main(String[] args) {
        /**
         * 반복문을 통해 사용자 입력을 처리하며, 예외 상황(잘못된 입력, 0으로 나누기 등)을 제어합니다.
         */
        ArithmeticCalculator cal = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            OperatorType operator;
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
                    System.out.print("사칙연산(+ - * /)을 입력하세요 : ");

                    // + - * / 로 입력받을 때
                    char inputOperator = sc.next().charAt(0);
                    operator = OperatorType.fromSymbol(inputOperator);

                    if (operator != null) {
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
                    if (operator == OperatorType.DIVIDE && num2 == 0) {
                        System.out.println("나눗셈 분모는 0으로 나눌 수 없습니다.");
                        continue;
                    }
                    break;
                }
                double result = cal.calculate(num1, num2, operator);
                System.out.println("result = " + result);
                System.out.println("결과 : " + cal.getResultList());


            } catch(InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 처음부터 다시 입력해주세요..");
                sc.nextLine();
                continue;
            }

            while (true) {
                sc.nextLine();
                System.out.print("[yes] 계속 / [exit] 종료 / [remove] 삭제 / [overs] 큰 값들 조회 / [max] 가장 큰 값 조회 / [dist] 중복 요소 제거: ");
                String command = sc.nextLine();
                if ("remove".equalsIgnoreCase(command)) {
                    cal.removeResult();
                    System.out.println("삭제한 계산 기록 : " + cal.getResultList());
                    continue;
                }

                if ("overs".equalsIgnoreCase(command)) {
                    System.out.print("입력한 숫자보다 큰 값들 조회 : ");
                    double threshold = sc.nextDouble();
                    cal.getBigValue(threshold);
                    System.out.println("input = " + cal.getBigValue(threshold));
                    continue;
                }

                if("max".equalsIgnoreCase(command)) {
                    System.out.print("가장 큰 값 조회 : " + cal.getMax());
                    continue;
                }

                if("dist".equalsIgnoreCase(command)) {
                    System.out.println("중복되는 요소들을 제거");
                    System.out.println("cal.getDistinct() = " + cal.getDistinct());
                    continue;
                }

                if ("yes".equalsIgnoreCase(command)) {
                    break;
                } else if ("exit".equalsIgnoreCase(command)) {
                    return;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }

            }
        }
    }
}
