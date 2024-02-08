import java.util.Scanner;

public class Exercise2 {
    public Exercise2() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("2자리 정수 입력(10~99): ");
        a = sc.nextInt();

        b = a%10;
        if((a/10 != b)){
            System.out.println("N0! 10의 자리와 1의 자리가 같지 않습니다");
        }
        else
            System.out.println("YES! 10의 자리와 1의 자리가 같습니다");

    }
}
