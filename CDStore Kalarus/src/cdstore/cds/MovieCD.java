package cdstore.cds;

/**
 * Klasa reprezentująca płytę z filmem
 * Rozszerza klasę CD
 * 
 * Konstruktor: bezpośrednie ustawienie pól
 * 
 * @author Olek Lamza
 */
public class MovieCD extends CD {
   private String director;
   
   /*
    * Konstruktory
    */
   public MovieCD() {
   }
   
   public MovieCD(String title, String director, double price) {
       // Ponieważ chcemy uzyskać dostęp do pól klasy nadrzędnej,
       // nie mogą być private (public odpada z oczywistych względów,
       // pozostaje dostęp pakietowy lub protected).
       this.title = title;
       this.price = price;
       
       this.director = director;
   }

   /*
    * Gettery i settery
    */ 
   public String getDirector() {
       return director;
   }
   public void setDirector(String director) {
       this.director = director;
   }
   
    /*
     * Przesłonięta metoda toString()
     */
    @Override
    public String toString() {
        return  super.toString() + nl
                + " director: "+director;
    }
    
}
