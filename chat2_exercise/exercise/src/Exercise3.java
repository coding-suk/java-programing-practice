import java.util.Scanner;

public class Exercise3 {
    public Exercise3() {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("금액을 입력하세요>> ");
        a = sc.nextInt();

        System.out.println("오만원권 " +a/50000+ '매');
        a %= 50000;
        System.out.println("만원권 " + a/10000+ '매');
        a %= 10000;
        System.out.println("천원권 " +a/1000+ '매');
        a %= 1000;
        System.out.println("백원 " +a/100+ '매');
        a %= 100;
        System.out.println("오십원 " +a/50+ '매');
        a %= 50;
        System.out.println("십원 " +a/10+ '매');
        a %= 10;
        System.out.println("일원 " +a+ '매');
    }
}
