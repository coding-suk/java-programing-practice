import java.util.Scanner;

public class ArrayAccess {
    public ArrayAccess(){
        Scanner sc = new Scanner(System.in);
        int max, i;
        int Array[] = new int[5];
        max = 0;
        System.out.println("양수 5개를 입력하세여: ");
        for (i=0;i<5;i++) {
            Array[i] = sc.nextInt();
            if (Array[i] > max){
                max = Array[i];
            }
        }
        System.out.print("가장 큰수는 "+max+"입니다");

    }
}
