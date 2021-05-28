package inferfaces;

// Seria tipo uma herança multipla
public class Honda implements Carro, Veiculo{


    @Override
    public String marca() {
        return "Honda Civic";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }

    @Override
    public String registro() {
        return "JODAODAS9939KDAKOSD";
    }

}
