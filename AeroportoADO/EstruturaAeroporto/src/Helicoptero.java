public class Helicoptero extends Aeronave {

    private boolean asaHelicoptero;

    public Helicoptero(int id, String origem, String destino, String piloto, String tipoCombustivel, String motor, int passageiros, boolean asaHelicoptero) {
        super(id, origem, destino, piloto, tipoCombustivel, motor, passageiros);
        this.asaHelicoptero = asaHelicoptero;
    }
}
