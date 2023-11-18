import java.util.List;

public class Voos {

    private int id;
    private Aeroporto origem;

    private Aeroporto destino;

    private List<Aviao> aviao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public List<Aviao> getAviao() {
        return aviao;
    }
}
