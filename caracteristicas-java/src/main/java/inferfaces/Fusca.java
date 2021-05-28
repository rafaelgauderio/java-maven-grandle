package inferfaces;

public class Fusca implements  Carro {
    // Lê-se Fusca é um Carro ou fusca implementa Carro

    @Override
    public String marca() {
        return "Volkswagem";
    }

    // Método default não precisa sobrescrever, ele é herdado, mas posso sobrescrever se quiser
    @Override
    public void ligar() {
        Carro.super.ligar();
    }

}
