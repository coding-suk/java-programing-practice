import java.util.Scanner;

public class exercise14 {
    public exercise14() {
        Scanner sc = new Scanner(System.in);
        String S;
        String course[] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        while (true) {
            System.out.print("과목 이름>> ");
            S = sc.next();
            if (S.equals("그만")) {
                break;
            }
            int a=0;
            for (int i =0; i<course.length;i++) {
                if(course[i].equals(S)) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    a = 1;
                }
            }
            if (a == 0) {
                System.out.println("없는 과목입니다");
            }
        }
    }
}
