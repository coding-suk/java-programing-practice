import java.util.Scanner;

public class Exercise6 {
    public Exercise6() {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("1~99 사이의 정수를 입력하시오>> ");
        a = sc.nextInt();

        if (a != 0 && a <100) {
            int x, y;
            x = a/10;
            y = a%10;

            if ((x == 3 || x == 6 || x == 9) && (y == 3 || y == 6 || y == 9)) {
                System.out.print("박수 짝짝");
            }
            else if ((x == 3 || x == 6 || x == 9) || (y == 3 || y == 6 || y == 9)) {
                System.out.print("박수 짝");
            }
        }
        else
            System.out.print("숫자 범위를 벗어났습니다.");
    }
}
