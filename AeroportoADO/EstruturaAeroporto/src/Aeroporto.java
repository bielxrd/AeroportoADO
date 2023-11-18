public class Aeroporto {

    private int id;
    private int pistas;
    private int terminais;
    private Hangares[] hangares;
    private String torreDeControle;


    public Aeroporto(int pistas, int terminais, String pista, String torreDeControle) {
        this.pistas = pistas;
        this.terminais = terminais;
        this.hangares = new Hangares[5];
        this.torreDeControle = torreDeControle;
    }

    public int getPistas() {
        return pistas;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }

    public int getTerminais() {
        return terminais;
    }

    public void setTerminais(int terminais) {
        this.terminais = terminais;
    }

    public String getTorreDeControle() {
        return torreDeControle;
    }

    public void setTorreDeControle(String torreDeControle) {
        this.torreDeControle = torreDeControle;
    }


}
