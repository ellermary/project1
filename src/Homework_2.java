import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_2 {
    public static void main(String[] args) throws IOException {

        /*Сила тяжести на Луне составляет около 17% земной.
        Напишите программу, которая вычислила бы ваш вес на Луне.


        System.out.print("Введите ваш вес в кг: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double weight = Double.parseDouble(reader.readLine());

        if (weight >= 0) {

            System.out.println("Ваш вес на Луне составил бы: " + (weight * 0.17) + " кг");

        } else System.out.println("Вес не может быть отрицательным!");
        */

        /* Видоизмените программу, созданную в упражнении 1 .2, таким образом,
        чтобы она выводила таблицу перевода дюймов в метры.
        Выведите значения длины до 12 футов через каждый дюйм.
        После каждых 1 2 дюймов выведите пустую строку. (Один метр приблизительно равен 39,37 дюйма.)

        В одном футе 12 дюймов.

        double inch, meter;
        int counter = 0;

        for (inch = 1; inch <= 144; inch++){
            meter = inch * 39.37;
            System.out.println(inch + " inch = " + meter + " meter");

            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        } */

        /* Напишите программу, которая находила бы все простые числа в диапазоне от 2 до 100.

        int num, j;
        int counter;


            for (num = 2; num <= 100; num++) {
                counter = 0;

                for (j = 2; j <= num; j++) {

                    if ((num % j) == 0) counter ++;

                }
                if (counter < 2 ) System.out.println(num);

            } */

        /* Коды АSСII-символов нижнего регистра отличается от кодов соответствующих символов
        верхнего регистра на величину 32. Следовательно, для преобразования строчной буквы в
        прописную нужно уменьшить ее код на 32. Используйте это обстоятельство для написания программы,
        читающей символы с клавиатуры. При выводе результатов данная программа должна преобразовывать
        строчные буквы в прописные, а прописные - в строчные. Остальные символы не должны меняться.
        Работа программы должна завершаться после того, как пользователь введет с клавиатуры точку.
        И наконец, сделайте так, чтобы программа отображала количество символов, для которых был изменен
        регистр.
         */

        /* int counter = 0;

        for (;;) {
            System.out.print("Введите символ: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            char[] ch = reader.readLine().toCharArray();
            char symbol = ch[0];


            if (symbol == '.'){
                break;
            } else if (symbol >= 'a' && symbol <= 'z') {
                System.out.println("Замена на символ: " + (char) (symbol - 32));
                counter++;
            } else if (symbol >= 'A' && symbol <= 'Z') {
                System.out.println("Замена на символ: " + (char) (symbol + 32));
                counter++;
            } else System.out.println("Символ " + symbol + " не изменяется");


        }
        System.out.println("Количество символов, для которых был изменен регистр: " + counter);

         */

            System.out.print("Введите букву, слово или предложение: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String str = reader.readLine();

            int counter = 0;

            for (int i = 0; i < str.length(); i++) // метод для вычисления длины
            {
                counter++;
            }
            System.out.println("Количество символов в строке: " + counter);

            System.out.print("Введите еще один символ: ");

            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            char[] ch = reader2.readLine().toCharArray();

            if (ch.length != 0) //проверяем, что массив не пустой
            {
                System.out.println("Новое количество символов в строке: " + (counter + 1));
            } else System.out.println("Количество символов не изменилось");







    }
}
