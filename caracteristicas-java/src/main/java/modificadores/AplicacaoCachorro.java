package modificadores;

public class AplicacaoCachorro {

    public static void main (String[] args) {

        final Cachorro golden = new Cachorro();
        golden.quantidadePatas="4 patas";
        // como a variável é estática,, o objeto guaipeca também vai ser alterado para 4 patas

        final Cachorro guaipeca = new Cachorro();

        System.out.println(golden.quantidadePatas);
        System.out.println(guaipeca.quantidadePatas);

        //Método estático não precisa ser instanciado para ser usado
        System.out.println(Cachorro.late());


    }

}
