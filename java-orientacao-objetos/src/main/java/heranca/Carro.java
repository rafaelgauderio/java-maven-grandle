package heranca;

public class Carro extends Veiculo{

    private int quantDePortas;

    public Carro () {

    }
    public Carro(int quantDePortas) {
        this.quantDePortas = quantDePortas;
    }

    public Carro(String modelo, String marca, int quantDePortas) {
        super(modelo, marca);
        this.quantDePortas = quantDePortas;
    }

    public Carro(String modelo, String marca, double valorVenal, int quantDePortas) {
        super(modelo, marca, valorVenal);
        this.quantDePortas = quantDePortas;
    }

    public int getQuantDePortas() {
        return quantDePortas;
    }

    public void setQuantDePortas(int quantDePortas) {
        this.quantDePortas = quantDePortas;
    }

    @Override
    public double calculaImposto() {
        return this.getValorVenal() * 0.08;
    }

    @Override
    public String toString() {
        return super.toString() + " Carro {" +
                "quantDePortas=" + quantDePortas +
                '}';
    }
}
