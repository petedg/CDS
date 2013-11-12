package cdstore.cds;

/**
 * Bazowa klasa reprezentująca płytę
 * 
 * @author Olek Lamza
 */
public class CD {
    // pola protected ze względu na konstruktor w klasie MovieCD
    protected String title;
    protected double price;

    // ma być dostępne w całej rodzinie
    protected String nl = System.getProperty("line.separator");
    
    /*
     * Konstruktory
     */
    public CD() {
    }

    public CD(String title, double price) {
        this.title = title;
        this.price = price;
    }
    /*
     * Gettery i settery
     */
    
    /*
     * Ponieważ pole tytułu jest obowiązkowe, w setterze sprawdzamy, czy jest
     * puste lub null. Jeżeli tak, rzucamy wyjątek (IllegalArgumentException).
     */
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Tytuł nie może być pusty");
        }
    }
    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    /*
     * Nadpisujemy metodę toString(), żeby wyświetlała ładne podsumowanie
     * stanu obiektu
     */
    @Override
    public String toString() {
        return getClass().getSimpleName()+nl
                +" title: "+title+nl
                +" price: "+price;
    }

}
