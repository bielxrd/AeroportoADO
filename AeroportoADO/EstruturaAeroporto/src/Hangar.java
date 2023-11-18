public class Hangar {

    private int id;
    private boolean estacionamento;

    private boolean manutencao;

    public Hangar(int id, boolean estacionamento, boolean manutencao) {
        this.id = id;
        this.estacionamento = estacionamento;
        this.manutencao = manutencao;
    }

    public Hangar() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }
}
