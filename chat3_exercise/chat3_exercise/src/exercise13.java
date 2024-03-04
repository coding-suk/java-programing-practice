public class exercise13 {
    public exercise13() {

        for(int x=0;x<100;x++) {
            int x1, x2;
            x1 = x % 10;
            x2 = x / 10;
            if ((x1 == 3 || x1 == 6 || x1 == 9) && (x2 == 3 || x2 == 6 || x2 == 9)) {
                System.out.println(x + " 박수 짝짝");
            }
            else if (x1 == 3 || x1 == 6 || x1 == 9 || x2 == 3 || x2 == 6 || x2 == 9) {
                System.out.println(x + " 박수 짝");
            }
        }
    }
}
