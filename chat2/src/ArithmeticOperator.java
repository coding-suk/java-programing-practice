import java.util.Scanner;

public class ArithmeticOperator {
    public ArithmeticOperator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int time = sc.nextInt();
        int second = time%60;
        int minute = (time/60)%60;
        int hour = (time/60)/60;

        System.out.println("초는 " + time);
        System.out.println("분는 " + minute);
        System.out.println("시는 " + hour);
        System.out.println("초는 " + second);
    }
}
