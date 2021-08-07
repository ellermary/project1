public class Lesson2 {
    public static void main(String[] args) {
        int a = 22;
        int b = 22;
        int c = 22;

        if (a <= b) {
            if (a <= c) {
                System.out.print(a + " ");
                if (b <= c) {
                    System.out.print(b + " " + c);
                } else {
                    System.out.print(c + " " + b);
                }
            }
        }
        else if (b <= c) {
            if (b <= a) {
                System.out.print(b + " ");
                if (a <= c) {
                    System.out.print(a + " " + c);
                } else {
                    System.out.print(c + " " + a);
                }
            }
        } else if (c <= a) {
            if (c <= b) {
                System.out.print(c + " ");
                if (b <= a) System.out.println(b + " " + a);
                else System.out.println(a + " " + b);
            }
        }
    }
}
