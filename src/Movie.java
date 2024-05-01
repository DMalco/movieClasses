import java.time.LocalDate;
import java.util.HashSet;

public class Movie {
    private String title;
    LocalDate releaseDate;
    private int length;
    private HashSet<Genre> genres; //Movie has genres - composition
    private HashSet<Person> people;



    public Movie(String aTitle, LocalDate aReleaseDate, int aLength, HashSet<Genre> genres, HashSet<Person> people)  {
        this.title = aTitle;
        this.releaseDate = aReleaseDate;
        this.length = aLength;
        this.genres = genres;


        this.people = people;
    }

    /**
     * Getter for Movie title
     * @return movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for Movie release date
     * @return movie release date
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * Getter for Movie length
     * @return movie length
     */
    public int getLength() {
        return length;
    }

    public HashSet<Genre> getGenres()
    {
        return this.genres;
    }

    /**
     * Adds a genre to the collection of genres
     * @param g the genre to add
     */
    public void addGenre(Genre g)
    {
        this.genres.add(g);
    }

    public void addPerson(Person p) //dynamic polymorphism
    {
        this.people.add(p);
    }

    public void listPeople()
    {
        for (Person p :this.people)
        {
            System.out.println(p.getName());
        }
    }

/*
    @Override
    public String toString(){
        return "Movie title: " + getTitle() + "\nreleased: " + getReleaseDate() + "\nGenre: " + getGenres() + "\nDirected by: " +
                getDirectors() +  "\nStarring: " + getActors();

        //build a string by going over hashset

    }*/




}
