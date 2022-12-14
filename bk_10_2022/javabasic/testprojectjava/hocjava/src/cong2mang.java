public class cong2mang {
    public static void main(String[] args) {
        int i, j;
        //khai bao 2 mang 2 chieu va gan gia tri vao cho no
        int[][] MangA = {{2, 1, 1, 2}, {4, 1, 4, 4}, {1, 1, 1, 1}, {2, 2, 2, 2}, {0, 0, 0, 2}};
        int[][] MangB = {{1, 1, 1, 1}, {2, 2, 2, 4}, {1, 2, 2, 1}, {2, 4, 4, 4}, {1, 1, 1, 3}};
        int[][] MangC;

        MangC = new int[4][4];

        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++)
                MangC[i][j] = MangA[i][j] + MangB[i][j];

            for (i = 0; i < 4; i++) {
                System.out.println("/n");
                for (j = 0; j < 4; j++)
                    System.out.println(MangC[i][j] + " ");
            }
        }

    }
} //chua xong


