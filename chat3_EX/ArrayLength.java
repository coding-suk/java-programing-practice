import java.util.Scanner;

public class ArrayLength {
    public ArrayLength() {
        Scanner sc = new Scanner(System.in);
        int Array[] = new int[5];
        int i, n, sum;
        sum=0;

        System.out.print("5개의 정수를 입력하세여>> ");

        for(i=0;i<Array.length;i++) {
            Array[i] = sc.nextInt();
        }

        for(i=0;i<Array.length;i++) {
            sum += Array[i];
        }
        System.out.print("평균은 "+(double)sum/Array.length);


    }
}
