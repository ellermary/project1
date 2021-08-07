package animal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewCat {
    public static void main(String[] args) throws IOException {
        /*
        Создать троих котов, по шаблону класса Cat.
        Вывести описание котов на экран, в виде:
        Это имя_кота, ему возраст_кота лет.
        У него цвет_глаз глаза и цвет_шерсти шерсть. Он очень характер_кота
         */

        Cat firstCat = new Cat();

            firstCat.name = "Мурзик";
            firstCat.age = 3;
            firstCat.eyecolor = "голубые";
            firstCat.furcolor = "белая";
            firstCat.behavior = "покладистый";

            firstCat.printText();

        Cat secondCat = new Cat();

        secondCat.name = "Рыжик";
        secondCat.age = 4;
        secondCat.eyecolor = "зеленые";
        secondCat.furcolor = "рыжая";
        secondCat.behavior = "игривый";

        secondCat.printText();

        Cat thirdCat = new Cat();

        thirdCat.name = "Уголек";
        thirdCat.age = 2;
        thirdCat.eyecolor = "янтарные";
        thirdCat.furcolor = "черная";
        thirdCat.behavior = "ласковый";

        thirdCat.printText();

        /*
        После выведения информации о созданных котах дать пользователю возможность
        выбрать одного кота (путем ввода имени кота с клавиатуры) и поуправлять им
        (вводить действия, которые может выпонять кот, например: царапать.
        ❕Если пользователь ввел несуществующую команду коту или неверное имя кота,
        в консоль должно быть выведено предупреждение типа: "Такого кота у нас нет"
        или "Этот кот не умеет этого делать"
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(;;) {
            System.out.println("Выберите кота по имени, введите кличку: ");
            String str = reader.readLine();
            if (str.equals(firstCat.name) || str.equals(secondCat.name) || str.equals(thirdCat.name)) {
                for(;;){
                System.out.println("Хотите поиграть с котом?");
                String str2 = reader.readLine();
                if(str2.equals("Да")){
                    firstCat.meow();
                    firstCat.scratch();
                    break;
                }
                if(str2.equals("Нет")){
                    System.out.println("Кот обиделся.");
                    firstCat.sleep();
                    break;
                } else System.out.println("Введите: Да или Нет");

                }

                break;
            } else System.out.println("Такого кота у нас нет");

        }

    }
}
