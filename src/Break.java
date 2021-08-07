import animal.Dog;

public class Break {
    public static void main(String[] args) {

        Dog dog2 = new Dog(6, "бульдог");


        int i;
        for (i = 1; i < 4; i++){
            one: {
               two: {
                three: {
                    System.out.println("i = " + i);
                    if (i == 1) break one;
                    if (i == 2) break two;
                    if (i == 3) break three;
                }
                   System.out.println("После блока 3");
            }
                System.out.println("После блока 2");

            }
            System.out.println("После блока 1");
        }
        System.out.println("После цикла for");

    }
}
