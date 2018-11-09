package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViitegeneraattoriIO {

    public static Viitegeneraattori instanssi;
    /*
    public static Viitegeneraattori getInstance() {
        if (instanssi == null) {
            instanssi = new Viitegeneraattori();
        }

        return instanssi;
    }
    */
    
    private int seuraava;
    
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
