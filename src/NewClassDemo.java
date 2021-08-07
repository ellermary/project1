public class NewClassDemo {
    public static void main(String[] args) {
        ClassDemo myClass = new ClassDemo(); //экземпляр класса - ссылка на объект

        myClass.printValue();
        myClass.x = 99;
        myClass.printValue();
    }
}
