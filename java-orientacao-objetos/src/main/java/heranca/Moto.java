package heranca;

public class Moto extends Veiculo {

    private String cilindradas;

    public Moto() {

    }

    public Moto(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String modelo, String marca, String cilindradas) {
        super(modelo, marca);
        this.cilindradas = cilindradas;
    }

    public Moto(String modelo, String marca, double valorVenal, String cilindradas) {
        super(modelo, marca, valorVenal);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }


    @Override
    public String toString() {
        return super.toString() + " Moto {" +
                "cilindradas='" + cilindradas + '\'' +
                '}';
    }
}
