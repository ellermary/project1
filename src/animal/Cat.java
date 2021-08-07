package animal;
public class Cat {

    String name;
    int age;
    String furcolor;
    String eyecolor;
    String behavior;

    void meow(){
        System.out.println("Кот мяукает");
    }
    void hunting(){
        System.out.println("Кот охотится");
    }
    void rest(){
        System.out.println("Кот отдыхает");
    }
    void scratch(){
        System.out.println("Кот царапается");
    }
    void sleep(){
        System.out.println("Кот спит");
    }

    void printText(){
        System.out.println("Это " + name + ", ему " + age + " года. У него " + eyecolor + " глаза и " + furcolor + " шерсть. Он очень " + behavior + ".");
    }

}
