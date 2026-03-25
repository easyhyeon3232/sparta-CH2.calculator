package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 계산하는 객체(인스턴스화)생성
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 정수를 입력하세요 : ");
            int num2 = sc.nextInt();

            if (num1 < 0 || num2 < 0) {
                System.out.println("0을 포함한 양의 정수를 입력하세요!");
                continue;
            }

            boolean flag = true;
            while (flag) {
                System.out.print("사칙연산을 입력하세요(+, -, *, /) : ");
                char op = sc.next().charAt(0);    //  charAt(0) : 첫 글자만 가져온다.

                // 사칙연산을 맞게 입력하면 클래스로 이동
                // if문으로 하나의 조건으로
                if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                    System.out.println("사칙연산을 잘못 입력하셨습니다. 다시 입력해주세요.");
                    continue;
                } else if(op == '/') {
                    if(num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }
                }
                flag = false;

                int result = cal.calculate(num1, num2, op);
                System.out.println("result = " + result);

                System.out.println("현재 계산 기록 : " + cal.getResultList());
            }


            // 더 계산할지 질문 그만하고 싶으면 exit 계속하고 싶으면 yes(대문자 가능)
            boolean flag2 = true;
            while (flag2) {
                // /n 비우기
                sc.nextLine();
                System.out.print("더 계산하려면 yes(YES), 종료를 원하면 exit(EXIT), 삭제을 원하면 remove(REMOVE)를 입력하세요 : ");
                String command = sc.nextLine();

                if (command.equalsIgnoreCase("remove")) {
                    cal.removeFirstList();
                    System.out.println("수정한 계산 기록 : " + cal.getResultList());
                    continue;
                }

//                if (finish.equalsIgnoreCase("clear")) {
//                    cal.setReslut(new ArrayList<>());
//                    System.out.println("전부 삭제되었습니다. 현재 계산 기록 : " + cal.getResultList());
//                    continue;
//                }

                switch (command) {
                    case "yes":
                        break;
                    case "exit":
                        System.out.println("종료하겠습니다.");
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다. 다시 입력주세요!!");
                        continue;
                }
                // 반복문 종료
                flag2 = false;
            }//while(flag2)
            break;
        }//while(yes)
    }//main
}//App
