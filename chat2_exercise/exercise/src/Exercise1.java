import java.util.Scanner;

public class Exercise1 {
    public Exercise1(){
        Scanner sc = new Scanner(System.in);
        int a;
        double b;

        System.out.print("원화를 입력하세요: ");
        a = sc.nextInt();

        b = a/1100;

        System.out.println(a+ "원은 $"+ b +"원 입니다");
    }
}
