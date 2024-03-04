import java.util.Scanner;
import java.util.Random;
public class open_chellange {
    Random r = new Random();
    String text;

    public open_chellange() {
        Scanner sc = new Scanner(System.in);
        int a, i;
        int k = r.nextInt(100); // 0~99까지 임의의 정수 생성
        a = 0;
        i = 0;
        System.out.print("수를 결정하였습니다. 맞추어 보세요 ");
        while(true) {
            System.out.println("0~99");
            i++;
            System.out.print(i+">>");
            a = sc.nextInt();
            if (a < k) {
                System.out.println("더 높게");
            } else if (a > k) {
                System.out.println("더 낮게");
            } else {
                System.out.println("맞았습니다");
                System.out.print("다시 시작하시겠습니까(y/n)>> ");
                text = sc.nextLine();
                if (text.equals("n")) {
                    break;
                }
            }
        }
    }
}