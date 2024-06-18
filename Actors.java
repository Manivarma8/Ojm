class Actors{
static String role = "Hero";
static String language = "Tamil";

String movie_name;
boolean hit;

public static void main(String[] args){


Actors vijay = new Actors();
Actors ajith = new Actors();

vijay.hit = true;
vijay.movie_name = "Ghilli";

ajith.hit = true;
ajith.movie_name = "Aasai";
vijay.act();
}
void act(){
System.out.println("Vijay hit movie is " + movie_name + " is it real " + "yes it is " + hit);
System.out.println("Ajith hit movie is " + movie_name + " is it real " + "yes it is " + hit);
System.out.println(" The language of the movie is " + language + " His role is " + role);
System.out.println(" The language of the movie is " + language + " His role is " + role);


}

} 
