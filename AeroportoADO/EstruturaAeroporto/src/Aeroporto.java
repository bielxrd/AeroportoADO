import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

    private int id;
    private int qtdPistas;

    private int qtdTerminais;

    private int qtdHangares;

    private TorreDeControle torreDeControle;

    private List<Voos> voos = new ArrayList<>();


    public Aeroporto(int id, int qtdPistas, int qtdTerminais, int qtdHangares) {
        this.id = id;
        this.qtdPistas = qtdPistas;
        this.qtdTerminais = qtdTerminais;
        this.qtdHangares = qtdHangares;

    }

    public Aeroporto() {
        this.qtdPistas = 1;
        this.torreDeControle = new TorreDeControle();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdPistas() {
        return qtdPistas;
    }

    public void setQtdPistas(int qtdPistas) {
        this.qtdPistas = qtdPistas;
    }

    public int getQtdTerminais() {
        return qtdTerminais;
    }

    public void setQtdTerminais(int qtdTerminais) {
        this.qtdTerminais = qtdTerminais;
    }

    public int getQtdHangares() {
        return qtdHangares;
    }

    public void setQtdHangares(int qtdHangares) {
        this.qtdHangares = qtdHangares;
    }

    public TorreDeControle getTorreDeControle() {
        return torreDeControle;
    }

    public void setTorreDeControle(TorreDeControle torreDeControle) {
        this.torreDeControle = torreDeControle;
    }
}
