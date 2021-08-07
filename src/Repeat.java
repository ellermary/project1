import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat {
    public static void main(String[] args) throws IOException {

//        byte b;
//        short sh = 1;
//        int i;
//        long l;
//
//        float f;
//        double d;
//
//        char ch;
//
//        boolean t;
//
//        byte b2 = (byte) sh;
//
//        String str = "вспомнить бы все";
//        System.out.println(str);

//        System.out.print("Введите свой возраст: ");
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String str = reader.readLine();
//        int age = Integer.parseInt(str);

//        int age1;
//        for(;;) {
//            System.out.print("Введите свой возраст: ");
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            int age1;
//            try {
//
//                age1 = Integer.parseInt(reader.readLine());
//                if (age1 > 0 && age1 < 150) {
//                    if (age1 < 18) {
//                        System.out.println("Пользователь несовершеннолетний");
//                        break;
//                    } else System.out.println("Пользователь совершеннолетний");
//                    break;
//
//
//                } else System.out.println("Неверно введен возраст");
//
//            } catch (Exception e) {
//                System.out.println("Введите возраст числом!");
//            }
//        }

        boolean state = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age;
        do {
            System.out.println("Введите свой возраст: ");
            try {
                age = Integer.parseInt(reader.readLine());
                if (age > 0 && age < 150 ) {

                    if (age < 18) System.out.println("Пользователь несовершеннолетний");
                    else System.out.println("Пользователь совершеннолетний");
                    state = false;
                } else {
                    System.out.println("Возраст недопустимый");
                    state = true;
                }
                } catch (Exception e) {
                System.out.println("Возраст должен быть записан числом");
                state = true;
            }
        } while (state);



//        if(age1 > 0 && age1 < 150){
//            if (age1 < 18) {
//                System.out.println("Пользователь несовершеннолетний");
//            } else System.out.println("Пользователь совершеннолетний");
//
//        } else System.out.println("Неверно введен возраст");

    }
}
