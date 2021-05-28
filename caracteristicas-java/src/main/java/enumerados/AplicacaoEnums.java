package enumerados;

public class AplicacaoEnums {

    public static void main(String [] args ) {

        System.out.println("Enums: tipos enumerados" +
                "\n\t\tBasicamente é um dicionário da dados." +
                "\n\t\tConstrutor semple declarado como private" +
                "\n\t\tNão é permitido criar novas instâcnias." +
                "\n\t\tPor convenção os nomes são em"+"maisculos".toUpperCase()+"\n");

        // Não tem como instanciar enum
        //TipoVEiculo tipo = new TipoVEiculo();

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);
        System.out.println(TipoVeiculo.AEREO);

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipos de veículos que enumerados:" + tipo);
        }




    }
}
