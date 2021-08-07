package Homework.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculate {

        public double num1;
        public double num2;
        public double result;
        public char operator;


        public double enterNumber1() {
            System.out.println("Введите первое число: ");
            Scanner reader = new Scanner(System.in);
            num1 = reader.nextDouble();
            return num1;
        }

        public double enterNumber2() {
            System.out.println("Введите второе число: ");
            Scanner reader = new Scanner(System.in);
            num2 = reader.nextDouble();
            return num2;
        }

        public char enterOperator() {
            System.out.println("Введите оператор выражения: ");
            Scanner reader = new Scanner(System.in);
            operator = reader.next().charAt(0);
            return operator;
        }

        double result() {

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Вы ввели неверный оператор, введите +,-,*,/");
                    break;
            }
            return result;
        }

        void printResult() {
            System.out.println("Результат\n" + num1 + " " + operator + " " + num2 + " = " + result);
        }




//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // создали объект класса BufferedReader
//        String str = reader.readLine(); // считали строку с консоли и записали ее в переменную str

//        char[] strToCharArray = str.toCharArray(); //преобразуем строку в массив символов
//                int num = 0;
//                for (int k : strToCharArray) {
//                    num = 10 * num + k;
//                }
//                System.out.println(num);

}
