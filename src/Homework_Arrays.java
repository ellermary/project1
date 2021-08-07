import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework_Arrays {
    public static void main(String[] args) throws IOException {

        /*
        1. Создать целочисленный массив, размером в 20 элементов.
        Заполнить массив элементами, введенными с клавиатуры
        (считаем, что пользователь вводит только числа).
        Вывести на экран минимальное и максимальное значение в массиве.
         */
//        int array[] = new int[20]; // указываем длину массива
//
//        System.out.println("Введите 20 чисел: ");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int num; // число, что вводим с клавиатуры
//        for (int i = 0; i < array.length; i++) {
//
//            num = Integer.parseInt(reader.readLine());
//            array[i] = num;// каждому i-ому эл-ту присваем значение, введенное с клавиатуры
//        }
//
//        int min = array[0];
//        int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//
//            if (min > array[i]) min = array[i]; // вычисляем минимум
//            if (max < array[i]) max = array[i]; // вычисляем максимум
//        }
//        System.out.println("Максимум: " + max + " Минимум: " + min);

        /*
        2.  Создать массив из 10 элементов, заполненный строками.
        Вывести на экран элементы массива в обратном порядке.
         */
//        String arr[] = {"Mary", "Ivan", "Anna", "Alex", "John", "Penelopa", "Tim", "Naomi", "Jack", "Fred"};
//
//        int n = arr.length;
//        String temp; // временная переменная
//
//        for (int i = 0; i < n/2; i++){
//            temp = arr[n-i-1]; // для замены на противоположный элемент
//            arr[n-i-1] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        String arr[] = {"Mary", "Ivan", "Anna", "Alex", "John", "Penelopa", "Tim", "Naomi", "Jack", "Fred"};
//        for (int i = 9; i < arr.length; i--) {
//            System.out.print(arr[i] + " ");
//        }

        /*
        3. Создать 2 массива одинакового размера: массив строк и чисел.
        Один массив сразу же проинициализировать строками.
        Второй массив заполнить значениями, которые соответствуют длине строк элементов первого массива.
        Вывести оба массива на экран.
         */

//        String arr_str[] = {"red", "blue", "white", "purple", "yellow"};
//        int arr_num[] = new int[5];
//
//        int amount; // переменная для длины(можно убрать эту переменную)
//
//        for (int i = 0; i < arr_str.length; i++) {
//            System.out.println(arr_str[i]);
//            amount = arr_str[i].length();
//            arr_num[i] = amount;
//            System.out.println(arr_num[i]);
//        }


        /*
        4. Создать массив из 20-ти элементов (способ заполнения массива на Ваше усмотрение).
        Разбить массив на две части. Вывести все три массива на экран
        (элементы каждого массива должны быть выведены в одну строку)
         */
        int arr_full[] = {67, 589, 236, 12, 1, 9, 4567, 2990, 34, 27, 4, 34597, 1735, 3, 947, 3057, 1999, 1000, 7, 888};

        int n = arr_full.length;

        int first_arr[] = new int [(int )n/2];
        int second_arr[] = new int [(int) n/2];

        for (int i = 0; i < n; i++) {
            if (i <  n/2) {
                first_arr[i] = arr_full[i];
            } else {
                second_arr[i - n/2] = arr_full[i];
            }
        }
        for (int x: arr_full) System.out.print(x + " ");
        System.out.println(" ");
        for (int x: first_arr) System.out.print(x + " ");
        System.out.println(" ");
        for (int x: second_arr) System.out.print(x + " ");


//
//        for (int i = 0; i < arr_full.length; i++) {
//            System.out.print(arr_full[i] + " ");
//        }
//        System.out.println(" ");
//        for (int i = 0; i < n/2; i++) {
//            System.out.print(arr_full[i] + " ");
//        }
//        System.out.println(" ");
//        for (int i = 10; i < arr_full.length; i++) {
//            System.out.print(arr_full[i] + " ");
//        }

        /*
        5. Задачка на подумать☀️ Создать массив из 15 чисел, каждое из которых пользователь
        должен ввести с клавиатуры. Разделить массив на четные и нечетные числа и записать
        их в 2 разных массива. Важно! Размеры массивов с четными и нечетными числами должны
        соответствовать количеству элементов в них, т. е. сумма количества элементов обеих массивов
        должна быть равно 15
         */

//        int arr_nums[] = new int[15];
//
//        int num1; // число с клавиатуры
//
//        System.out.println("Введите 15 чисел: ");
//        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i = 0; i < arr_nums.length; i++) {
//            num1 = Integer.parseInt(reader1.readLine());
//            arr_nums[i] = num1;
////            System.out.print(arr_nums[i]);
//        }
//        System.out.print("Четные: ");
//        for (int i = 0; i < arr_nums.length; i++) {
//            if (arr_nums[i]%2 == 0) {
//                System.out.print(arr_nums[i] + " ");
//            }
//        }
//        System.out.println("Нечетные: ");
//        for (int i = 0; i < arr_nums.length; i++) {
//            if (arr_nums[i]%2 != 0) {
//                System.out.print(arr_nums[i] + " ");
//            }
//        }


    }
}
