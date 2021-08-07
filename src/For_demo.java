public class For_demo {
    public static void main(String[] args) {

        double[] arr = {4, 7, 9, 5};
//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//
//        for (;;) {
//
//            System.out.println("Эта программа будет выполняться вечно :)");
//            break;
//        }
//        System.out.println("Или нет!");
//
//        for (double i : arr) {
//            System.out.println(i);
//        }
//
//        int j;
//        for (j = 0; j < 8; j++) {
//            System.out.println("Переменная " + j + " в цикле");
//        }
//
//        System.out.println("Переменная " + j + " вне цикла");

//        int a = 10;
//        int b = 0;
//
//        for (int i = 0; a > b; i++) {
//            a--;
//            b++;
//            System.out.println("a все еще больше b");
//        }

        int i = 0;

        for (;;) {
            i++;
            System.out.println(" ");
            if (i == 10) {
                System.out.println("А вот сейчас остановится");
                break;
            }
            else System.out.println("Еще одно выполнение");
            System.out.println("До break");
        }

        System.out.println("После break ");
    }
}
