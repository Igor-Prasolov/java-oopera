import java.util.ArrayList;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;


    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }


    MusicalShow(String title, int duration, Director director,
                ArrayList<Actor> actors, String musicAuthor, String librettoText) {
        super(title, duration, director, actors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

}


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



