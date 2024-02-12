public class foreachEx {
    enum Week {월, 화, 수, 목, 금, 토, 일} // enum = 나열 타입
    public foreachEx() {
//        int[] n = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int k : n) {
//            sum += k;
//        }
//        System.out.println("합은" + sum);
        int n[] = {1, 2, 3, 4, 5};
        String name[] = {"사과","배","바나나","채리","딸기","포도"};
        int sum = 0;

        for(int k : n) {
            System.out.print(k+" ");
            sum += k;
        }
        System.out.print("합은 "+sum);
        System.out.println();

        for(String s : name) {
            System.out.print(s+ " ");
        }
        System.out.println();

        for(Week day : Week.values()) {
            System.out.print(day + " ");
        }
        System.out.println();
    }
}
