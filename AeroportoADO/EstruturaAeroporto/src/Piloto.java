public class Piloto {

    private String nome;

    public void solicitarPouso(TorreDeControle torre) {

        System.out.println("Solicitiando pouso do aviao: " + torre.avioes.pollFirst());


    }

    public void solicitarDecolagem(TorreDeControle torre) {

        torre.avioes.addLast(new Avioes(1, "Sao paulo", "Rio de janeiro", "Gabriel", "Gasolina", "X", 15));
        System.out.println("Solicitando decolagem: " + torre.avioes.peekLast());
    }

}
