package modificadores;

public class AplicacaoGamer {

    public static void main(String [] args) {

        //consigo instanciar HardcoreGamer, só não consigo estender

        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final GamerHerdado gamerHerdado = new GamerHerdado();

        final var game = "Mortal Combat";

        System.out.println(gamerHerdado.play(game));



    }
}
