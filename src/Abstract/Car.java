package Abstract;

public class Car extends Transport{

    Car(String type, boolean license){
        super(type, license);
    }

    @Override
    void move() {
        System.out.println("Заправь бак и жми на педаль.");
    }

}
