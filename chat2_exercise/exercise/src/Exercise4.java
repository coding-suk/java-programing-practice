import java.util.Scanner;

public class Exercise4 {
    public Exercise4() {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("정수 3개 입력>> ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b) {
            if (b > c){
                if (a < c) {
                    System.out.print("중간 값은 " + c);
                }
            }
        }
        else if(a > b) {
            if (a > c) {
                if (c < b) {
                    System.out.print("중간 값 " + b);
                }
            }
        }
    }
}
