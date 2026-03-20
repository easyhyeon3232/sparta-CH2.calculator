package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int num = scr.nextInt();
        System.out.println("정수를 입력하세요 : ");
        int num1 = scr.nextInt();

//        scr.nextLine();
//        System.out.println("사칙연산을 입력하세요(+, -, *, /) : ");
//        String sen = scr.nextLine();

//        if(sen.equals("+")) {
//            System.out.println(num + "+" + num1 + "=" + (num+num1));
//        } else if(sen.equals("-")) {
//            System.out.println(num + "-" + num1 + "=" + (num-num1));
//        } else if(sen.equals("*")) {
//            System.out.println(num + "x" + num1 + "=" + (num * num1));
//        } else if(sen.equals("/")) {
//            System.out.println(num + "/" + num1 + "=" + (num/num1));
//        } else
//            System.out.println(" 사칙연산을 다시 입력하세요");


        if(num > 0 && num1 > 0) {
            scr.nextLine();
            System.out.println("사칙연산을 입력하세요(+, -, *, /) : ");
            String sen = scr.nextLine();

            if(sen.equals("+")) {
                System.out.println(num + "+" + num1 + "=" + (num+num1));
            } else if(sen.equals("-")) {
                System.out.println(num + "-" + num1 + "=" + (num-num1));
            } else if(sen.equals("*")) {
                System.out.println(num + "x" + num1 + "=" + (num * num1));
            } else if(sen.equals("/")) {
                System.out.println(num + "/" + num1 + "=" + (num/num1));
            } else
                System.out.println(" 사칙연산을 다시 입력하세요");
        }else
            System.out.println("0은 입력될 수 없습니다. 다시 입력하세요");

        // readme.md 서식
//# 🍎 자바 기초 계산기 과제
//> 스파르타 백엔드 부트캠프 4기 - 김OO
//
//### 1. 프로젝트 소개
//        - 자바의 기초 문법(if, switch, Scanner)을 활용한 계산기 프로그램입니다.
//
//### 2. 주요 기능
//        - [x] 사칙연산 (+, -, *, /) 기능
//                - [x] 0으로 나눌 때의 예외 처리 (중첩 if문 활용)
//                - [x] 사용자 반복 입력 기능
//
//### 3. 배운 점
//        - `Scanner`의 버퍼 문제 해결법을 익혔습니다.
//                - `switch`문과 `if`문을 조합하여 조건 분기를 효율적으로 처리했습니다.






    }
}
