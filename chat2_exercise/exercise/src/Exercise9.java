import java.util.Scanner;

public class Exercise9 {
    public Exercise9() {
        Scanner sc = new Scanner(System.in);
        double a ,b, c, x, y;

        System.out.print("원의 중심과 반지름 입력>> ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.print("점 입력>> ");
        x = sc.nextDouble();
        y = sc.nextDouble();



        double distance = Math.sqrt((x-a)*(x-a)+(b-y)*(b-y));

        if (distance < c) {
            System.out.print("점 ("+x+","+y+")는 원 안에 있다");
        }
        else
            System.out.print("점 ("+x+","+y+")는 원 밖에 있다");

    }
}
