public class Avioes extends Aeronave {
    private boolean asaFixa;

    public Avioes(int id, String origem, String destino, String piloto, String tipoCombustivel, String motor, int passageiros) {
        super(id, origem, destino, piloto, tipoCombustivel, motor, passageiros);
        this.asaFixa = true;
    }
}
