package Abstract;

public abstract class Transport {

    final String type;
    int wheels;
    double speed;
    boolean license;

    Transport (String type, boolean license){
        this.type = type;
        this.license = license;
    }

    abstract void move();

    void printSpeed(){
        System.out.println("Скорость данного типа транспорта составляет " + speed + " км/ч");
    }


}
