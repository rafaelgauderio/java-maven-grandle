package classeDate;

import java.util.Date;

public class AplicacaoDate {

    public static void main(String [] args ) {

        System.out.println("\n" +
                "Date() -> vai alocar um objeto da classe Date e o inicializará com o milissegundo mais próximo do \n" +
                "\t\tperíodo de sua execução\n");

        Date novaData = new Date();
        System.out.println("Data: " + novaData);

    }
}
