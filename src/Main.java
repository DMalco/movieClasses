import java.time.LocalDate;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {

      /*  LocalDate ld = LocalDate.parse("1999-01-23");
        LocalDate ld2 = LocalDate.parse("2000-08-14");

        HashSet<Genre> genres = new HashSet<>();
        genres.add(Genre.Horror);
        genres.add(Genre.Thriller);





        Director d = new Director("Martin Scorsese", "American", ld);
        Director d2 = new Director("Peter Jackson", "New Zealand", ld2);
        //Director d3 = new Director("Tim Burton", "American", 1958);
        //Director d4 = new Director("David Fincher", "American", 1962);
        HashSet<Director> directors = new HashSet<>();
        directors.add(d);

        Actor a = new Actor("Robert De Niro", "American", ld);
        Actor a2 = new Actor("Johnny Depp", "American", ld2);
        //Actor a3 = new Actor("Elijah Wood", "American", 1943);
        //Actor a4 = new Actor("Helena Bonham Carter", "British", 1966);
        HashSet<Actor> actors = new HashSet<>();
        actors.add(a);
        actors.add(a2);

        Movie m = new Movie("Goodfellas", ld , 146, genres, directors, actors);
        Movie m2 = new Movie("Cape Fear", ld2, 128, genres,directors, actors);
        //Movie m3 = new Movie("Fight Club", 1999, 139);
        //Movie m4 = new Movie("Lord of the Rings", 2001, 178);

        System.out.println(m.toString());
*/
        HashSet<Actor> actors = new HashSet<>();
        LocalDate ld = LocalDate.now();
        Actor a1 = new Actor("NameA1", "Nation1", ld);
        Actor a2 = new Actor("NameA2", "Nation2", ld);
        Director d1 = new Director("NameD1", "NationD1", ld);
        Director d2 = new Director("NameD2", "NationD2", ld);


        Movie m = new Movie("NewMovie", ld, 430, new HashSet<Genre>(), new HashSet<Person>());
        m.addPerson(a1);
        m.addPerson(a2);
        m.addPerson(d1);
        m.addPerson(d2);

        m.listPeople();















/*
        for (Actor a : actors)
        {
            System.out.println(a.getName() + " " + a.getNationality());
        }

        boolean removed = false;

        for (Actor a : actors)
        {
            if (a.getName().equals("Name1"))//Parameter value
            {
                actors.remove(a);
                removed = actors.remove(a);
            }
        }*/



    }
}
