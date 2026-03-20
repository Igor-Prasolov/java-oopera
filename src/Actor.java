public class Actor extends Person {
    int height;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + height;
        return hash;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " см)";
    }


    Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }
}