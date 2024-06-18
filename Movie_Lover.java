public class Movie_Lover
{

public static void main(String[] args)
{
	
Movie_Lover manivarman = new Movie_Lover(); 
Movie movie = manivarman.watch(); 
System.out.println(movie.movie_name);
System.out.println(movie.actor1);

}
public Movie watch()
{
Movie movie1 = new Movie("VTV", "Simbu", "Trisha", 120); 
return movie1; 
}
}

