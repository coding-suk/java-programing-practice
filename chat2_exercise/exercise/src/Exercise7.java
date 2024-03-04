import java.util.Scanner;

public class Exercise7 {
    public Exercise7() {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("점 (x,y)의 좌표를 입력하시오>> ");
        x = sc.nextInt();
        y = sc.nextInt();

        if((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
            System.out.print("(" + x + "," + y + ")는 사각형 안에 있습니다");

        }
        else
            System.out.print("사각형 외부에 있습니다");
    }
}
