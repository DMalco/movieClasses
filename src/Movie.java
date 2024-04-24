import java.time.LocalDate;
import java.util.HashSet;

public class Movie {
    private String title;
    LocalDate releaseDate;
    private int length;
    private HashSet<Genre> genres; //Movie has genres - composition

    private HashSet<Director> directors;
    private HashSet<Actor> actors;


    public Movie(String aTitle, LocalDate aReleaseDate, int aLength, HashSet<Genre> genres, HashSet<Director> directors, HashSet<Actor> actors)  {
        this.title = aTitle;
        this.releaseDate = aReleaseDate;
        this.length = aLength;
        this.genres = genres;
        this.directors = directors;
        this.actors = actors;
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

    public HashSet<Director> getDirectors(){
        return this.directors;
    }

    public void addDirector(Director d)
    {
        this.directors.add(d);
    }

    public HashSet<Actor> getActors()
    {
        return  this.actors;
    }

    public void addActor(Actor a)
    {
        this.actors.add(a);
    }

    @Override
    public String toString(){
        return "Movie title: " + getTitle() + "\nreleased: " + getReleaseDate() + "\nGenre: " + getGenres() + "\nDirected by: " +
                getDirectors() +  "\nStarring: " + getActors();

        //build a string by going over hashset

    }



}
