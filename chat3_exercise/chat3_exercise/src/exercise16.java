import java.util.Scanner;

public class exercise16 {
    public exercise16() {
        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        String s;

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
        while (true) {
            int n = (int) (Math.random() * 3);
            System.out.print("가위 바위 보!>> ");
            s = sc.next();
            if (s.equals("그만")) {
                System.out.print("게임을 종료합니다");
                break;
            }
            if (str[n].equals(s)) {
                System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + s + " 비겼습니다");
            } else {
                if (str[n].equals("바위")) {
                    if (str[n].equals("보")) {
                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + s + " 이겼습니다");
                    } else {
                        System.out.println("컴퓨터 = " + str[n] + ", 사용자 = " + s + " 졌습니다");
                    }
                }
                else if (str[n].equals("보")) {
                    if(str[n].equals("가위")) {
                        System.out.println("컴퓨터 = " + str[n] +", 사용자 = " + s + " 이겼습니다");
                    }
                    else {
                        System.out.println("컴퓨터 = " + str[n] +", 사용자 = " + s + " 졌습니다");
                    }
                }
                else if (str[n].equals("가위")) {
                    if(str[n].equals("바위")) {
                        System.out.println("컴퓨터 = " + str[n] +", 사용자 = " + s + " 이겼습니다");
                    }
                    else {
                        System.out.println("컴퓨터 = " + str[n] +", 사용자 = " + s + " 졌습니다");
                    }
                }
            }
        }
    }
}
