package cliente;

public class AplicacaoCliente {

    public static void main(String [] args ) {

        Cliente cliente = new Cliente("Joao", 34, 85.5f);

        // Não acessa método metodoRelatorio, pois está como protected e em outro pacote.
        //cliente.metodoRelatorio();

        System.out.println(cliente.toString());

    }
}
