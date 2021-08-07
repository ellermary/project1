package Abstract;

public class Vehicles {
    public static void main(String[] args) {
        Car car = new Car("Car", true);
        Bike bike = new Bike("Bike", false);

        Transport[] transports = new Transport[2];
        transports[0] = new Car("Car", true);
        transports[1] = new Bike("Bike", false);

        //Transport transport = new Car("Car", true);


        car.move();
        bike.move();
    }
}
