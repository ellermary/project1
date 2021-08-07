package Abstract;

public class Bike extends Transport{

    Bike(String type, boolean license) {
        super(type, license);
    }

    @Override
    void move() {
        System.out.println("Крути педали!");
    }

}
