public class Director extends Person {
    private int numbersOfShows;


    public int getNumbersOfShows() {
        return numbersOfShows;
    }

    public void setNumbersOfShows(int numbersOfShows) {
        this.numbersOfShows = numbersOfShows;
    }


    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Director director = (Director) obj;
        return numbersOfShows == director.numbersOfShows;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numbersOfShows;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director{" +
                "numbersOfShows=" + numbersOfShows +
                '}';
    }

    Director(String name, String surname, Gender gender, int numbersOfShows) {
        super(name, surname, gender);
        this.numbersOfShows = numbersOfShows;
    }
}
