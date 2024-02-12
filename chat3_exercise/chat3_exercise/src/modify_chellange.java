import java.util.Random;
import java.util.Scanner;

public class modify_chellange {
    public modify_chellange() {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a, b ,i, k, c;

        while (true) {
            a = 0; b = 99;
            String text = "";
            k = r.nextInt(100);
            i=0;

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            while (true) {
                System.out.println(a+"~"+b);
                i++;
                System.out.print(i + ">>");
                c = sc.nextInt();
                if (c < k) {
                    System.out.println("더 높게");
                    a = c;
                } else if (c > k) {
                    System.out.println("더 낮게");
                    b = c;
                } else {
                    System.out.println("맞았습니다");
                    break;
                }
            }
            System.out.print("다시 결정하겠습니까(y/n)>>");
            text = sc.next(); // 왜 nextLine이 안돼는걸까??

            if (text.equals("n"))
                break;
            else continue;
        }
    }
}
