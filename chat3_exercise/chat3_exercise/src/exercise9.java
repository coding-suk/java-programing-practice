public class exercise9 {
    public exercise9() {
        int arr[][] = new int[4][4];

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
