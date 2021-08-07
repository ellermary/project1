import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {7, 43, 21, 234, 15, 678, 88, 0, 67};
        int var;

        for(int i = 0; i < array.length; i++){

            for(int j = 1; j < array.length - i; j++) // можно обойтись без минус i
            {
                if (array[j - 1] > array[j]){
                    var = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = var;
                }
            }
        }

        Arrays.sort(array); // сортировка

        //System.out.println(Arrays.toString(array));
        for (int arr: array) //переменная будет поочередно принимать значения из массива
        {
            System.out.print(arr + " ");
        }

        int min = array[0];
        int max = array[0];

        for (int num : array){

            if (min > num){
                min = num;
            }

            if (max < num){
                max = num;
            }
        }
    }
}
