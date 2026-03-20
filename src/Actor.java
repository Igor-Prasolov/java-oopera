import java.util.ArrayList;

import java.util.Objects;

public class Actor extends Person {
    private int height;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return height == actor.height
                && Objects.equals(getName(), actor.getName())
                && Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, getName(), getSurname());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + "(" + getHeight() + " см)";
    }


    Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }
}