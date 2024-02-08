import java.util.Scanner;

public class Exercise5 {
    public Exercise5() {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("정수 3개를 입력하시오>> ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a+b)<c || (a+c)<b || (b+c)<a) {
            System.out.print("삼각형이 될수 없습니다");
        }
        else
            System.out.print("삼각형이 됩니다");
    }
}
