package modificadores;

public class GamerHerdado  extends Gamer{


    @Override
    public String keyboard() {
        return super.keyboard();
    }

    /* Não tem como sobrescrever mouse, pois o método é final na classe pai Gamer

    @Override
    public String mouse() {
        return super.Mouse();
    }
     */

    public String play(final String game) {
        return "Jogando " + game;
    }

}
