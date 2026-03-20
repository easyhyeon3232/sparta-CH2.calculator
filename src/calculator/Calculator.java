package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = scr.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int num1 = scr.nextInt();

        scr.nextLine();
        System.out.print("사칙연산을 입력하세요(+, -, *, /) : ");
        String sen = scr.nextLine();


        // if문
        if (sen.equals("+")) {
            System.out.println(num + "+" + num1 + "=" + (num + num1));
        } else if (sen.equals("-")) {
            System.out.println(num + "-" + num1 + "=" + (num - num1));
        } else if (sen.equals("*")) {
            System.out.println(num + "x" + num1 + "=" + (num * num1));
        } else if (sen.equals("/")) {
            if(num1 == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            } else
                System.out.println(num + "/" + num1 + "=" + (num / num1));
        } else
            System.out.println(" 사칙연산을 다시 입력하세요");



    }
}