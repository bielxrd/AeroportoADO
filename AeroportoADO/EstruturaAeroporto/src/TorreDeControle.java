import java.lang.reflect.Array;
import java.util.*;

public class TorreDeControle {

    private int id;
    private List<Radar> radares = new ArrayList<>();

    private int qtdControladores;

    public TorreDeControle(int qtdControladores) {
        this.qtdControladores = qtdControladores;
    }

    public TorreDeControle() {
        this.qtdControladores = 1;
    }



}
