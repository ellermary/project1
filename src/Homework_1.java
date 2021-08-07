import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_1 {
    public static void main(String[] args) throws IOException {

        System.out.print("Список тем: \n" + "1. Типы данных \n" + "2. Переменные \n" + "3. Операторы \n" + "4. Циклы \n" + "5. Массивы \n \n");

        for (;;) {

            System.out.print("Введите номер раздела: ");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String str = reader.readLine();
            int num = Integer.parseInt(str);

            if (num == 0){
                System.out.println("Раздел не может быть нулем! Закрытие программы!");
                break;
            } else {

                switch (num) {
                    case 1:
                        System.out.println("Раздел Типы данных: \n" + "Каждая переменная и каждое выражение в Java обладает типом и этот тип строго определен. \n" + "Типы данных делятся на примитивные, ссылочные и тип String(строка). \n");
                        break;
                    case 2:
                        System.out.println("Раздел Переменные: \n" + "Java переменные могут быть атрибутами класса, параметрами метода или могут использоваться в программе для краткосрочного хранения данных. В языке Java все переменные должны быть объявлены, перед тем, как они будут использоваться. \n" + "Переменные типы данных: \n" + "-byte (целые числа, 1 байт) \n" + "-short (целые числа, 2 байта) \n" + "-int (целые числа, 4 байта) \n" + "-long (целые числа, 8 байтов) \n" + "-float (вещественные числа, 4 байта) \n" + "-double (вещественные числа, 8 байтов) \n" + "-char (символ Unicode, 2 байта) \n" + "-boolean (значение истина/ложь, 1 байт)\n");
                        break;
                    case 3:
                        System.out.println("Раздел Операторы: \n" + "Java предоставляет богатый набор операторов для управления переменными. Все операторы Java можно разделить на следующие группы: \n" + "-арифметические операторы; \n" + "-операторы сравнения; \n" + "-побитовые операторы; \n" + "-логические операторы; \n" + "-операторы присваивания; \n" + "-прочие операторы. \n");
                        break;
                    case 4:
                        System.out.println("Раздел Циклы: \n" + "В Java выделяют 4 вида циклов: \n" + " 1. Цикл while \n" + "2. Цикл do...while \n" + "3. Цикл for \n" + "4. Цикл for each \n");
                        break;
                    case 5:
                        System.out.println("Раздел Массивы: \n" + "Когда-нибудь я буду знать :) \n");
                        break;
                    default:
                        System.out.println("Данного номера раздела не существует!");

                }
            }
        }


    }
}
