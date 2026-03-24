package calculator;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 계산하는 객체(인스턴스화)생성
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        String finish = "yes";

        while (finish.equalsIgnoreCase("yes")) {

            System.out.print("첫 번째 정수를 입력하세요 : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 정수를 입력하세요 : ");
            int num2 = sc.nextInt();

            if (num1 < 0 || num2 < 0) {
                System.out.println("0을 포함한 양의 정수를 입력하세요!");
                continue;
            }

            System.out.print("사칙연산을 입력하세요(+, -, *, /) : ");
            //  charAt(0) : 첫 글자만 가져온다.
            char sen = sc.next().charAt(0);

            // 사칙연산을 맞게 입력하면 클래스로 이동
            switch (sen) {
                case '+':
                case '-':
                case '*':
                case '/':
                    break;
                default:
                    System.out.println("사칙연산을 잘못 입력하셨습니다. 다시 입력하세요");
                    continue;
            }
            int result = cal.calculate(num1, num2, sen);
            System.out.println("result = " + result);

            System.out.println("현재 계산 기록 : " + cal.getResultList());

            // 더 계산할지 질문 그만하고 싶으면 exit 계속하고 싶으면 yes(대문자 가능)
            boolean flag3 = true;
            while (flag3) {
                // /n 비우기
                sc.nextLine();
                System.out.print("더 계산하려면 yes(YES), 종료를 원하면 exit(EXIT), 수정을 원하면 update(UPDATE)를 입력하세요 : ");
                finish = sc.nextLine();

                if(finish.equalsIgnoreCase("update")) {
                    cal.removeList();
                    System.out.println("수정한 계산 기록 : " + cal.getResultList());
                    continue;
                }

                switch (finish) {
                    case "yes":
                        break;
                    case "exit":
                        System.out.println("종료하겠습니다.");
                        break;
                    case "update":
                        cal.removeList();
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다. 다시 입력주세요!!");
                        continue;
                }
                // 반복문 종료
                flag3 = false;
            }//while(flag3)
        }//while(yes)
    }//main
}//App


// 질문 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현하라는데
// 가장 먼저 저장된 데이터는 새로운 값이 들어오면 덮어지는 거 아닌가?
// setter 활용
//            System.out.println("현재 num의 값 : " + num1);
//            cal.setNum(num1);