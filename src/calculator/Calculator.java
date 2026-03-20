package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String finish = "";

        while (!finish.equals("exit")) {

            // 양의 정수 (0포함)
            System.out.print("정수를 입력하세요 : ");
            int num = scr.nextInt();
            System.out.print("정수를 입력하세요 : ");
            int num2 = scr.nextInt();

            boolean flag = true;

            while (flag) {
                scr.nextLine();
                System.out.print("사칙연산을 입력하세요(+, -, *, /) : ");
                String sen = scr.nextLine();

                if (sen.equals("+")) {
                    System.out.println(num + "+" + num2 + "=" + (num + num2));

                } else if (sen.equals("-")) {
                    System.out.println(num + "-" + num2 + "=" + (num - num2));

                } else if (sen.equals("*")) {
                    System.out.println(num + "x" + num2 + "=" + (num * num2));

                } else if (sen.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    } else
                        System.out.println(num + "/" + num2 + "=" + (num / num2));
                    //break;
                } else {
                    System.out.println("사칙연산을 잘 못 입력하셨습니다. 다시 입력하세요.");
                    continue;
                }
                flag = false;
            }
            // 더 계산하시겠습니까 에서 exit 또는 yes만 입력되게 처리하기
            System.out.print("더 계산하시겠습니까? : ");
            finish = scr.nextLine();
        }


    }
}