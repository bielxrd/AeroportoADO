import java.lang.reflect.Array;
import java.util.*;

public class TorreDeControle {

    private int id;
    private String controlador;
    public ArrayDeque<Avioes> avioes;


    public TorreDeControle() {
        this.avioes = new ArrayDeque<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getControlador() {
        return controlador;
    }

    public void setControlador(String controlador) {
        this.controlador = controlador;
    }
}
