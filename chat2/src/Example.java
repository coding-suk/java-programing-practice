//조건문 예제들
import java.util.Scanner;
public class Example {
    Scanner sc = new Scanner(System.in);

    public Example() {
        // 예제2-10
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        if (score >= 80)
            System.out.println("축하합니다! 합격입니다.");

    }

    public class MultipleOfThree {
        //예제 2-11
        public void MultipleOfThree() {
            Scanner sc = new Scanner(System.in);

            System.out.print("수를 입력하세요 ");
            int num = sc.nextInt();
            if (num % 3 == 0)
                System.out.println("3의 배수입니다");
            else
                System.out.println("3의 배수가 아닙니다");
        }
    }
}
