package Lessons.Lesson1;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
//        Random random = new Random();

        int[] arr = new int[10];

//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(100);
//        }

        PrintArrays.randomArray(arr, 200);
        PrintArrays.printArray(arr);
    }
}
