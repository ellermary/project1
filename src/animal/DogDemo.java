package animal;
public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog(5, "мопс");
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        dog.ownerName = "Вася";
    }
}
