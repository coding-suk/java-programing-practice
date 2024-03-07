import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise15 {
    public exercise15() {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {
            System.out.print("곱하고자 하는 두 수 입력>> ");
            try {
                a = sc.nextInt();
                b = sc.nextInt();

                System.out.print(a + "X" + b + "=" + a * b);
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다");
                sc.nextLine();
            }
        }
    }
}
