public class Lesson2_2 {
    public static void main(String[] args) {
        int a = 42;
        int b = 72;
        int c;

        c = (a > b) ? a : b; // тернарный оператор
        System.out.println(c);

        /* int c = 42;

        if (a <= b && a <= c) { // логическое И
            System.out.print(a + " ");
            if (b <= c) System.out.println(b + " " + c);
            else System.out.println(c + " " + b);
        }
        else if (b <= c && b <= a) {
            System.out.println(b + " ");
            if (a <= c) System.out.println(a + " " + c);
            else System.out.println(c + " " + a);
        }
        else if (c <= b && c <= a) {
            System.out.println(c + " ");
            if (a <= b) System.out.println(a + " " + b);
            else System.out.println(b + " " + a);
        } */
    }
}
