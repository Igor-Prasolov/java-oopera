public class Director extends Person {
    private int numbersOfShows;


    public int getNumbersOfShows() {
        return numbersOfShows;
    }

    public void setNumbersOfShows(int numbersOfShows) {
        this.numbersOfShows = numbersOfShows;
    }

    public void printDirectorInfo() {
        System.out.println(getName() + " " + getSurname());

    }

    Director(String name, String surname, Gender gender, int numbersOfShows) {
        super(name, surname, gender);
        this.numbersOfShows = numbersOfShows;
    }
}
