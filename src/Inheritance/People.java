package Inheritance;

public class People {
    public static void main(String[] args) {
        Grandmother grandmother = new Grandmother(90, "Соня", "графиня");
        Mother mother = new Mother(40, "Анна", "коммунистка", "повар");
        Child child = new Child(19, "Ваня", "геймер", "программист", "GTA");

        System.out.println(grandmother.getAdditionalInfo());
        grandmother.said("Садись покушать!");

        mother.said("Надень шапку!");
        mother.action("Пользоваться микроволновкой");
        System.out.println(mother.getAdditionalInfo());

        child.said("Ну мааам");
        child.action("Хулиганит");
        child.gadgets("Компьютер");
    }
}
