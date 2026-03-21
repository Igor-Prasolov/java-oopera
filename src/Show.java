import java.util.*;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> actor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(actor);
    }


    public void printDirectorInfo() {
        System.out.println(director.toString());
    }


    public void printAllActorsInfo() {
        System.out.println("\nСписок актеров: " + title);
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public boolean addNewActor(Actor actor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.equals(actor)) {
                System.out.println("---------------------");
                System.out.println("Актёр " + actor + " уже участвует в спектакле.");
                return false;
            }
        }
        listOfActors.add(actor);
        System.out.println("---------------------");
        System.out.println("Актёр " + actor + " успешно добавлен в спектакль.");
        return true;
    }

    public boolean replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (Objects.equals(listOfActors.get(i).getSurname(), surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("---------------------");
                System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor + ".");
                return true;
            }
        }
        System.out.println("---------------------");
        System.out.println("Актёра с фамилией " + surnameToReplace + " не найдено в списке.");
        return false;
    }
}
