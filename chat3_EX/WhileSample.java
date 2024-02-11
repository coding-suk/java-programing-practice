import java.util.Scanner;

public class WhileSample {
    public WhileSample() {
        Scanner sc = new Scanner(System.in);
        int count, sum, n;
        count = 0;
        sum = 0;

        System.out.print("정수를 입력하고 마지막에 -1을 입력하시오. ");
        n = sc.nextInt();

        while (n != -1) {
            sum += n;
            count++;
            n = sc.nextInt();
        }
        if (count == 0) {
            System.out.println("입력된 수가 없습니다 ");
        }
        else{
            System.out.println("정수의 개수는" +count+"개 이며 평균은 "+(double)sum/count+"입니다");
        }

    }
}
