package StaticVars;

public class Test {
    public static void main(String[] args) {

        System.out.println(StaticVars.G);
        System.out.println(StaticVars.PI);
        System.out.println(StaticMethods.add(3, 7));
        System.out.println(StaticMethods.division(33, 11));

        NonStaticVars vars = new NonStaticVars();
        NonStaticMethods methods = new NonStaticMethods();

        System.out.println(vars.K);
        System.out.println(vars.E);
        System.out.println(methods.multiply(3,5));
        System.out.println(methods.add(7, 14));
    }
}
