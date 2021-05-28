package inferfaces;

public class AplicacaoInterface {

    public static void main (String [] args) {

        System.out.println("interface: É um recurso utilizado para obrigar a um determinado grupo de classe" +
                "\n\t\t a ter métodos ou propriedades em comum para existir em um determinado elemento." +
                "\nFuncionam como contratos de métodos abstratos." +
                "\nMétodos Abstratos: Devem ser implementados por todos, novos métodos queram as implementações." +
                "\nMétodos Default: são herdados a todos que implementam, novos métodos não quebram implementações" +
                "\n\t\tQuando um interface implementa aquele algo, ela se torna aquele algo." +
                "\n\t\tinterfaces podem ser herdadas."+
                "\nJava não possui herança multiplica. Mas com interfaces tu consegues implementas mais de uma interface.");

        final Fusca fusca = new Fusca();
        System.out.println("\n\nMarca do fusca é " + fusca.marca());
        fusca.ligar();

        final Trator volvo = new Trator();
        System.out.println("O registro do Trator : " + volvo.registro());
        volvo.ligar();

        final Honda hondaCivic = new Honda();
        System.out.println("Marca do Honda é " + hondaCivic.marca());
        System.out.println("Registro do Honda é " + hondaCivic.registro());
        hondaCivic.ligar();





    }


}
