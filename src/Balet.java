import java.util.ArrayList;

class Balet extends MusicalShow {
    private String choreographer;


    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    Balet(String title, int duration, Director director,
          ArrayList<Actor> actors, String musicAuthor,
          String librettoText, String choreographer) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

}
