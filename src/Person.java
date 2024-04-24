import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String nationality;
    private LocalDate dateOfBirth;


    /**
     * Constructor for Person Class
     * @param aName Name of a person
     * @param aNationality  Nationality of a person
     * @param aDateOfBirth year of birth of a person
     */
    public Person(String aName, String aNationality, LocalDate aDateOfBirth){
    this.name = aName;
    this.nationality = aNationality;
    this.dateOfBirth = aDateOfBirth;
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
     * Getter for Person's date of birth
     * @return person date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
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


    /**
     * Returns a string describing the state of the Person object
     * @return a string describing the state of the Person object
     */
    @Override
    public String toString()
    {
        return "\nAn object of " + this.getClass() + " with the name of " + getName() + " with the Nationality " + getNationality() + " born " +getDateOfBirth();
        //return "Name: " + getName() + ", Age: " + getAge() + "\n";
    }




}
