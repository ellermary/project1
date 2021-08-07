import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_Arrays2 {
    public static void main(String[] args) throws IOException {

        /*
        Создать двумерный массив (тип данных определите сами) и
        заполнить его таким образом, чтобы получилось такое изображение:
*            *
    *     *
        *
    *     *
*            *
Вывести массив на экран
         */
//        String x[][] = new String[5][5];
//
//        for(int i = 0; i < x.length; i++){
//            for(int j = 0; j < x[i].length; j++){
//                x[i][j] = (j == i || j == x.length - 1 - i) ? "x" : " ";
//                System.out.print(x[i][j] + " ");
//
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(reader.readLine());
//            if (arr[i] % 2 == 0) {
//                evenSize++;
//            } else oddSize++;
//        }
//
//        int two_arrs[][] = new int[2][];
//        two_arrs[0] = new int[evenSize];
//        two_arrs[1] = new int[oddSize];
//
//        for (int i = 0; i < two_arrs.length; i++) {
//            for (int j = 0; j < two_arrs[i].length; j++) {
//                for (int k = 0; k < arr.length; k++) {
//
//                if (arr[k] % 2 == 0) {
//                    two_arrs[0][j] = arr[k];
//                }
//
//            }
//            }
//        }

//        int arr[] = new int[6];
//        int evenSize = 0;
//        int oddSize = 0;
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Введите 15 чисел: ");
//        int even[] = new int[evenSize];
//        int odd[] = new int[oddSize];
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Введите 15 чисел: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(reader.readLine());
//            if (arr[i]%2 == 0){
//                even[evenSize] = arr[i];
//                evenSize++;
//            } else oddSize++;
//        }

//
//        for(int x : even) System.out.print(x + " ");
//        System.out.println(" ");
//
//        int even[] = new int[evenSize];
//        int odd[] = new int[oddSize];
//
//        for(int i = 0; i < even.length; i++) {
//            for(int j = 0; j < arr.length; j++) {
//                if (arr[j] % 2 == 0) {
//                    even[i] = arr[j];
//                }
//            }
//        }
//
//        for(int x : even) System.out.print(x + " ");
//        System.out.println(" ");
//        for(int x : odd) System.out.print(x + " ");
//        System.out.println(" ");

        int even = 0;
        int[] full_arr = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




    }
}
