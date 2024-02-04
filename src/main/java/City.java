import animals.Alligator;
import animals.Animals;
import animals.Lion;

public class City {

    // Имя мэра
    String nameMayor = "Fatima";

    static String time1 = "9:00-17:00";
    static String time2 = "18:00";
    static String separator = "--------------------------";

    public static void main(String[] args) {

        // Создаем объект зоопарк
        Zoo myFavoriteZoo = new Zoo();

        // С помощью сеттеров устанавливаем значения для данных класса Zoo
        myFavoriteZoo.setName("FunnyBober");
        myFavoriteZoo.setAddress("Moscow, VDNH");
        myFavoriteZoo.setWorkingHours("9:00-17:00");

        // Создаем объект лев
        Lion lionBarsik = new Lion("Млекопитающие", "Самец", "5 лет", "Барсик");

        // Создаем объект аллигатор
        Alligator alligatorGena = new Alligator("Пресмыкающиеся", "Самец", "3 года", "Гена");

        // Добавляем зверей в зоопарк
        myFavoriteZoo.setAnimalsList(lionBarsik);
        myFavoriteZoo.setAnimalsList(alligatorGena);

        System.out.println(separator);

        // Проверяем открыт ли зоопарк
        if (myFavoriteZoo.openCloseMainGate(time1)) {
            System.out.println("Зоопарк " + myFavoriteZoo.getName() + " открыт.");
        } else {
            System.out.println("Зоопарк " + myFavoriteZoo.getName() + " закрыт.\n"
                    + "Время работы: " + myFavoriteZoo.getWorkingHours());
        }

        System.out.println(separator);

        System.out.println(myFavoriteZoo);

        System.out.println(separator);

        for (Animals animal : myFavoriteZoo.getAnimalsList()) {
            System.out.println(animal.makeSound());
            System.out.println(separator);
        }

    }
}
