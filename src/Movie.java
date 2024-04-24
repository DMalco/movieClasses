import java.time.LocalDate;

public class Movie {
    private String title;
    LocalDate releaseYear;
    private int length;

    public Movie(String aTitle, LocalDate aReleaseYear, int aLength ) {
        this.title = aTitle;
        this.releaseYear = aReleaseYear;
        this.length = aLength;
    }

    /**
     * Getter for Movie title
     * @return movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for Movie release year
     * @return movie release year
     */
    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    /**
     * Getter for Movie length
     * @return movie length
     */
    public int getLength() {
        return length;
    }

}
