import java.util.Scanner;

public class exercise3 {
    public exercise3() {
        Scanner sc = new Scanner(System.in);
        int i, j, k;

        System.out.print("정수를 입력하시오>> ");
        k = sc.nextInt();

        for(i=0;i<k;i++) {
            for(j=k;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
