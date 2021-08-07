package Inheritance;

public class Mother extends Grandmother{

    String profession;

    Mother(int age, String name, String status, String profession){
        super(age, name, status);
        this.profession = profession;
    }

    void action(String act) {
        System.out.println(act);
    }

}
