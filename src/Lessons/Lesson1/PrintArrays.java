package Lessons.Lesson1;

import java.util.Random;

public class PrintArrays {

    static void printArray(int[] arr) {
        System.out.println("Print array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void randomArray(int[] arr, int bound) {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(bound);
        }
    }
}
