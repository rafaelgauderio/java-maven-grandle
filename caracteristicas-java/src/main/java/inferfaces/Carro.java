package inferfaces;

// É possivel um interface herdar outro interface ("Tipo de uma herança multiplica)
public interface Carro extends Automovel{

    // É redudante declarar um método como public em uma interface
    public String marca();

    // métodos privador tem que ter um body
    private String modelo() {
        return null;
    }

    default void ligar() {
        System.out.println("Ligando o carro");
    }

    // Ao implementar um método default ele herdou o comportamento, não preciso sobrescrever, não foi quebrado o contrato
    default String codigoRenavan() {
        return "DAIISA003KDKASDKASK";
    }

}
