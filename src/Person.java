import java.time.LocalDate;

public class Person {
    private String name;
    private String nationality;
    private LocalDate yearOfBirth;



    public Person(String aName, String aNationality, LocalDate aYearOfBirth){
    this.name = aName;
    this.nationality = aNationality;
    this.yearOfBirth = aYearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }






}
