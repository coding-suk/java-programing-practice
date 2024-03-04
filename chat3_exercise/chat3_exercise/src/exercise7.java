import java.util.Scanner;

public class exercise7 {
    public exercise7() {
        Scanner sc= new Scanner(System.in);
        int a[] = new int[10];
        int x, sum;

        sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for(int i=0; i < a.length; i++) {
            int y = (int)(Math.random()*10 + 1);
            sum += y;
            System.out.print(y +" ");
        }
        System.out.println();
        System.out.print("평균은 " + (double)sum/a.length);

    }
}
