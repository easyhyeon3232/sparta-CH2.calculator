package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // yes 넣어주는 이유 : String finish에 ""이거나 null인 상태에서 while문으로 가면
        // string finish = ""의 ""와 while문의 yes는 같지 않아서 false야 하고 종료시킨다.
        String finish = "yes";

        // finish가 YES이면 실행
        // finish.equalsIgnoreCase("yes") 이 조건을 안넣고
        // 그냥 true만 넣었을 때 exit를 입력해도 종료안되고 "정수를 입력하세요" 출력됨
        // 궁금한 점
        // yes.equalsIgnoreCase("finish") 바뀌면 뭐가 달라지는 지
        while (finish.equalsIgnoreCase("yes")) {

            // 문자열을 입력했을 때 예외처리 하기
            System.out.print("정수를 입력하세요 : ");
            int num = scr.nextInt();
            System.out.print("정수를 입력하세요 : ");
            int num2 = scr.nextInt();


            // 양의 정수 (0포함)
            if (num < 0 || num2 < 0) {
                System.out.println("0을 포함한 양의 정수를 입력하세요");
                // num이나 num2가 음의 정수가 입력되면 다시 0을 포함한 양의 정수를 입력하기 위해 while문 처음으로 가서 정수를 입력한다.
                // continue : 반복문(while, for)에서만 사용 가능
                continue;
            }

            // 사칙연사 계산하는 부분
            boolean flag = true;

            // 참이면 실행 거짓이면 실행x / flag가 true이기 때문에 실행
            while (flag) {
                scr.nextLine();
                System.out.print("사칙연산을 입력하세요(+, -, *, /) : ");
                String sen = scr.nextLine();

                // 입력된 값이 +. - , *, /이면 계산된 값을 출력해라
                if (sen.equals("+")) {
                    System.out.println(num + "+" + num2 + "=" + (num + num2));

                } else if (sen.equals("-")) {
                    System.out.println(num + "-" + num2 + "=" + (num - num2));

                } else if (sen.equals("*")) {
                    System.out.println(num + "x" + num2 + "=" + (num * num2));

                } else if (sen.equals("/")) {
                    // 나눗셈 두 번째 정수가 0이면 오류가 나기 때문에 입력할 수 없다는 문구 출력
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    } else
                        System.out.println(num + "/" + num2 + "=" + (num / num2));
                } else {
                    System.out.println("사칙연산을 잘못 입력하셨습니다. 다시 입력하세요.");
                    // 사칙연산을 잘못 입력했을 때 다시 사칙연산을 입력하기 위해서 while문 처음으로 가기위해 continue입력
                    continue;
                }
                // 무한 반복을 종료하기 위해 false로 while문 종료
                flag = false;

            }

            // while문이 종료되면서
            // 더 계산하시겠습니까? 에서 exit 또는 yes만 입력되게 처리하기(대문자 가능)
            boolean flag2 = true;

            while (flag2) {

                System.out.print("더 계산하려면 yes(YES), 종료를 원하면 exit(EXIT)를 입력하세요 : ");
                finish = scr.nextLine();

                if (finish.equalsIgnoreCase("yes")) {
                    //yes이면 계속 진행
                    break;
                } else if (finish.equalsIgnoreCase("exit")) {
                    // exit를 입력하면 종료
                    System.out.println("종료하겠습니다.");
                } else {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!!");
                    continue;
                }
                flag2 = false;

            }
        }
    }
}