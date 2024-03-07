public class exercise10 {
    public exercise10() {
        int arr[][] = new int[4][4];
        int a = 0;

        while (a <10) {
            int x = (int)(Math.random()*4);
            int y = (int)(Math.random()*4);
            if(arr[x][y] == 0) {
                arr[x][y] = (int)(Math.random()*10 +1);
                a++;
            }
        }
        for(int i =0;i<arr.length;i++) {
            for(int j =0;j<arr.length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
