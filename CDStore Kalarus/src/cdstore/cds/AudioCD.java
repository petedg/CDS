package cdstore.cds;

/**
 * Klasa reprezentująca płytę audio
 * Rozszerza klasę CD
 * 
 * Konstruktory: wywołanie konstruktora klasy nadrzędnej
 * 
 * @author Olek Lamza
 */
public class AudioCD extends CD {
    private String artist;

    /*
     * Konstruktory
     */
    public AudioCD() {
    }

    // W konstruktorze klasy potomnej wywołujemy konstruktor klasy nadrzędnej
    public AudioCD(String title, String artist, double price) {
        super(title, price);
        this.artist = artist;
    }
    
    
   /*
    * Gettery i settery
    */
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /*
     * Przesłonięta metoda toString()
     */
    @Override
    public String toString() {
        return  super.toString() + nl
                + " artist: "+artist;
    }
}
