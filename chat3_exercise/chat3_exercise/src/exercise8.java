import java.util.Scanner;

public class exercise8 {
    public exercise8() {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("정수 몇개? ");
        a = sc.nextInt();
        for(int i=1; i<=a;i++) {
            int x = (int)(Math.random()*100);
            System.out.print(x+ " ");
            if(i%10 == 0)
                System.out.println();
        }
    }
}
