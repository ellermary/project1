import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While_Lesson4 {
    public static void main(String[] args) throws IOException {

//        System.out.print("Введите число: ");
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int num = Integer.parseInt(reader.readLine());
//        int fact = 1;
//
//        if (num == 0){
//            System.out.println("Факториал 0 = 1");
//        } else if (num > 0) {
//            for (int i = 1; i <= num; i++) {
//
//                fact *= i;
//            }
//            System.out.println("Факториал числа " + num + " = " + fact);
//        } else {
//            System.out.println("Не существует факториала отрицательного числа!");
//        }

        System.out.print("Введите символ нижнего регистра: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = reader.readLine().toCharArray();//разбить строку на массив символов
        char symbol = ch[0];

        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Результат верхнего регистра: " + (char)(symbol - 32));
        } else {
            System.out.println("Вы ввели символ, который не является символом нижнего регистра.");
        }

    }
}
