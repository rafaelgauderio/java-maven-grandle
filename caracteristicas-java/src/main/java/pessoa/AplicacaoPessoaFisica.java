package pessoa;

public class AplicacaoPessoaFisica {

    public static void main (String [] args) {

        PessoaFisica rafael = new PessoaFisica("Rafael De Luca", 35, 78.5f);

        System.out.println(rafael.metodoRelatorio()+"\n");

        System.out.println(rafael);

    }


}
