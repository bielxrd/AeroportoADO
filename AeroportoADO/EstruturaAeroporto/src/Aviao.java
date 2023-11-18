import java.util.ArrayList;
import java.util.List;

public class Aviao {

    private int id;
    private boolean asaFixa;

    private boolean helicoptero;

    public List<Piloto> pilotos;

    public String copiloto;

    public String combustivel;

    public String motor;

    public int passageiros;

    public Aviao(int id, boolean asaFixa, String combustivel, String motor, int passageiros) {
        this.id = id;
        this.asaFixa = asaFixa;
        this.helicoptero =false;
        this.pilotos = new ArrayList<>();
        this.combustivel = combustivel;
        this.motor = motor;
        this.passageiros = passageiros;
    }

    public Aviao(int id, boolean asaFixa, boolean helicoptero, String combustivel, String motor, int passageiros) {
        this.id = id;
        this.asaFixa = false;
        this.helicoptero = helicoptero;
        this.pilotos = new ArrayList<>();
        this.combustivel = combustivel;
        this.motor = motor;
        this.passageiros = passageiros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAsaFixa() {
        return asaFixa;
    }

    public void setAsaFixa(boolean asaFixa) {
        this.asaFixa = asaFixa;
    }

    public boolean isHelicoptero() {
        return helicoptero;
    }

    public void setHelicoptero(boolean helicoptero) {
        this.helicoptero = helicoptero;
    }

    public void pousar() {
        if(isHelicoptero()) {
            System.out.println("Pousando sem pista");
        } else if (isAsaFixa()) {
            System.out.println("Pousando na pista");
        }
    }

    public void decolar() {
        if(isHelicoptero()) {
            System.out.println("Decolando sem pista");
        } else if (isAsaFixa()) {
            System.out.println("Decolando na pista");
        }
    }

}
