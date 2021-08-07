public class TwoTable {
    public static void main(String[] args) {
//        int table [][] = new int [10][20];
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 20; j++) {
//                table[i][j] = i;
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }

        int table[][] = new int[4][];//указываем сколько эл-тов будет находиться в этом одномерном массиве
        table[0] = new int[5];
        table[1] = new int[9];
        table[2] = new int[8];
        table[3] = new int[2];

        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = j;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
