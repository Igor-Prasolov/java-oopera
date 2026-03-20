import java.util.ArrayList;

class Opera extends MusicalShow {
    private int choirSize;


    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }


    Opera(String title, int duration, Director director,
          ArrayList<Actor> actors, String musicAuthor,
          String librettoText, int choirSize) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

}
