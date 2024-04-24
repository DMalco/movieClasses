import java.time.LocalDate;

public class Person {
    private String name;
    private String nationality;
    private LocalDate yearOfBirth;


    /**
     * Constructor for Person Class
     * @param aName Name of a person
     * @param aNationality  Nationality of a person
     * @param aYearOfBirth year of birth of a person
     */
    public Person(String aName, String aNationality, LocalDate aYearOfBirth){
    this.name = aName;
    this.nationality = aNationality;
    this.yearOfBirth = aYearOfBirth;
    }

    /**
     * Getter for Person's name
     * @return Person Name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for Person's nationality
     * @return person Nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Getter for Person's year of birth
     * @return person year of birth
     */
    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Setter for person's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for person's nationality
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }






}
