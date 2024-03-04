import java.util.Scanner;

public class exercise6 {
    public exercise6() {
        Scanner sc = new Scanner(System.in);
        int a[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int k;

        System.out.print("금액을 입력하시오>> ");
        k = sc.nextInt();
        for(int m = 0; m<a.length;m++) {
            System.out.println(a[m]+ "원 짜리 : " + k/a[m]);
            k = k%a[m];
            if (k/a[m]==0) {
                continue;
            }
        }

    }
}
