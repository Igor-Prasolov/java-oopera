import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Мариевна", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Андрей", "Андреевич", Gender.MALE, 190);


        Director director1 = new Director("Петр", "Петров", Gender.MALE, 4);
        Director director2 = new Director("Артем", "Артемов", Gender.MALE, 2);

        String musicAuthor = "Роман Романов";
        String choreographer = "Данил Данилович";

        Show show = new Show("Обыкновенный спектакль", 60, director1, new ArrayList<>());
        show.addNewActor(actor1);
        show.addNewActor(actor3);

        Opera opera = new Opera("Опера", 50, director2, new ArrayList<>(), musicAuthor, "лалалала", 2);
        opera.addNewActor(actor1);
        opera.addNewActor(actor2);

        Balet balet = new Balet("Балет", 90, director1, new ArrayList<>(), musicAuthor, "татата", choreographer);
        balet.addNewActor(actor2);
        balet.addNewActor(actor3);

        show.printAllActorsInfo();
        opera.printAllActorsInfo();
        balet.printAllActorsInfo();

        System.out.println();
        balet.replaceActor("Андреевич", actor1);
        balet.printAllActorsInfo();

        opera.replaceActor("Алексеевна", actor1);

        System.out.println("---Либретто--");
        balet.printLibretto();
        opera.printLibretto();
    }
}
