package Inheritance;

public class Grandmother {
    int age;
    String name;
    String status;
    private String additionalInfo = "Умеет доить корову";

    Grandmother(int age, String name, String status){
        this.age = age;
        this.name = name;
        this.status = status;
    }

    void said(String message){
        System.out.println(message);
    }

    String getAdditionalInfo(){
        return additionalInfo;
    }
}
