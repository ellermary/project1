import java.util.Arrays;

public class BubbleSort_Homework_3 {
    public static void main(String[] args) {

        int[] array = {4, 78, 32, 56, 67, 123, 567, 1, 999, 12};
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 1; i < array.length; i++) {

                if ( array[i] > array[i - 1]) {
                    int num = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = num;
                    sort = false;

                }
            }
            System.out.println(Arrays.toString(array));
        }

//        boolean sort = false; // не сортир через первый проход, поэтому нужно крутить, пока все не будет тру
//        while (!sort) {
//            sort = true;
//
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] < array[i - 1])  // сравниваю правую и левую, если да, то меняем местами
//                {
//                    int num = array[i]; // будет третья временная переменная для хр-я значения
//                    array[i] = array[i - 1];
//                    array[i - 1] = num;
//                    sort = false;
//                }
//            }
//            System.out.println(Arrays.toString(array));
//        }

    }
}
