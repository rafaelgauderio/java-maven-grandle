package heranca;

public class AplicacaoVeiculo {

    public static void main (String [] args) {

        Carro gol = new Carro();
        gol.setMarca("Volkswagen");
        gol.setModelo("Novo gol");
        gol.setQuantDePortas(4);
        gol.setValorVenal(50000);


        Moto ninja = new Moto();
        ninja.setMarca("Kawasaki");
        ninja.setModelo("Ninjinha");
        ninja.setCilindradas("850 cv");
        ninja.setValorVenal(15300.50);


        System.out.println(gol);
        System.out.println("Imposto do carro " +String.format("r$ %.2f",gol.calculaImposto()));
        gol.acelera();



        System.out.println("\n"+ ninja);
        System.out.println("Imposto da moto " +String.format("r$ %.2f",ninja.calculaImposto()));
        ninja.acelera();

    }

}
