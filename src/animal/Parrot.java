package animal;
public class Parrot {

    String name;
    String color;
    boolean speak;
    int age;
    int weight;

    Parrot () {
        name = "Кеша";
        color = "зеленый";
        speak = false;
        age = 21;
        weight = 50;
    }

    Parrot (String name, String parrotColor) {
        color = parrotColor;
        this.name = name;
        speak = false;
        age = 1;
        weight = 50;
    }

    Parrot(String name, String color, boolean speak, int age, int weight) {
        this.name = name;
        this.color = color;
        this.speak = speak;
        this.age = age;
        this.weight = weight;
    }

    int parrotAge(int years) {
        int newAge = age + years;
        return newAge;

    }

    void parrotInfo(int years) {
        String sAge = "год";
        String sYears = "год";
        String sNewAge = "год";

        if (age < 100 && age > 0) {
            int num = age%10;
            if(num == 1){
                sAge = "год";
            } else if(num < 5 && num > 1) sAge = "года";
            else sAge = "лет";
        }
        if (years < 100 && years > 0) {
            int num = age%10;
            if(num == 1){
                sYears = "год";
            } else if(num < 5 && num > 1) sYears = "года";
            else sYears = "лет";
        }
        if (parrotAge(years) < 100 && parrotAge(years) > 0) {
            int num = age%10;
            if(num == 1){
                sNewAge = "год";
            } else if(num < 5 && num > 1) sNewAge = "года";
            else sNewAge = "лет";
        }
//        switch (age) {
//            case 1:
//                sAge = "год";
//                break;
//            case 2:
//            case 3:
//            case 4:
//                sAge = "года";
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 0:
//                sAge = "лет";
//                break;
//        }
//        switch (years) {
//            case 1:
//                sYears = "год";
//                break;
//            case 2:
//            case 3:
//            case 4:
//                sYears = "года";
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 0:
//                sYears = "лет"; //вообще тут можно бесконечно прописывать и наверное есть вариант попроще ))
//                break;
//        }
//        switch (parrotAge(years)) {
//            case 1:
//                sNewAge = "год";
//                break;
//            case 2:
//            case 3:
//            case 4:
//                sNewAge = "года";
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 0:
//                sNewAge = "лет"; //вообще тут можно бесконечно прописывать и наверное есть вариант попроще ))
//                break;
//        }
        if(speak) {
            System.out.println("Этого попугая зовут " + name + ". Он " + color + ". Он говорящий. Ему " + age + " " + sAge + " и он весит "
                    + weight + " грамм. Через " + years + " " + sYears + " ему будет " + parrotAge(years) + " " + sNewAge);
            System.out.println(name + " говорит: Привет! Меня зовут " + name + " и я умею говорить.");
        } else System.out.println("Этого попугая зовут " + name + ". Он " + color + ". Он не говорящий. Ему " + age + " " + sAge + " и он весит "
        + weight + " грамм. Через " + years + " " + sYears + " ему будет " + parrotAge(years) + " " + sNewAge);
    }

}
