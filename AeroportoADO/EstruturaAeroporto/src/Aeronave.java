public class Aeronave {
    private int id;
    private String origem;
    private String destino;
    private String piloto;
    private String tipoCombustivel;
    private String motor;
    private int passageiros;

    public Aeronave(int id, String origem, String destino, String piloto, String tipoCombustivel, String motor, int passageiros) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.passageiros = passageiros;
    }
}
