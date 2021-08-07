package animal;
public class Dog {

    private int age;//мод доступа делает переменную доступной только внутри класса dog
    private String breed;
    public String name;//доступная для всех перем-я
    String ownerName;

    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    int getAge() {
        return age; // getter
    }
    void setAge(int age) {
        this.age = age; // setter
    }
    String getBreed() {
        return breed;
    }
    void setBreed(String breed) {
        this.breed = breed;
    }
}
