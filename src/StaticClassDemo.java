public class StaticClassDemo {
    int myVar = StaticClass.myVariable;

    public static void main(String[] args) {
        StaticClass.printMessage();

        StaticClass myClass = new StaticClass();
        int mySecondVar = myClass.mySecondVar;
        myClass.printAnotherMessage();
    }
}
