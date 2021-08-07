package animal;
public class Parrots {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();

        parrot.parrotInfo(5);

        Parrot secondParrot = new Parrot("Вася", "синий");
        secondParrot.parrotInfo(7);

//        int newVasyaAge = secondParrot.parrotAge();
//        System.out.println(newVasyaAge);

//        System.out.println(secondParrot.parrotAge(9));

        Parrot thirdParrot = new Parrot("Ара", "белый", true, 2, 150);
        thirdParrot.parrotInfo(3);
    }
}
