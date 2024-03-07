public class exercise13 {
    public exercise13() {
        for(int i = 1; i<100;i++) {
            int x1 = i / 10;
            int x2 = i % 10;
            if ((x1 == 3 || x1 == 6 || x1 == 9) && (x2 == 3 || x2 == 6 || x2 == 9)) {
                System.out.println(i + " 박수 짝짝");
            }
            else if ((x1 == 3 || x1 == 6 || x1 == 9 || x2 == 3 || x2 == 6 || x2 == 9))
                System.out.println(i + " 박수 짝");
        }
    }
}
