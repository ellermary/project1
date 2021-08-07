package Inheritance;

public class Child extends Mother{

    String game;

    Child(int age, String name, String status, String profession, String game){
        super(age, name, status, profession);
        this.game = game;
    }

    void gadgets(String gadgets){
        System.out.println(gadgets);
    }
}
