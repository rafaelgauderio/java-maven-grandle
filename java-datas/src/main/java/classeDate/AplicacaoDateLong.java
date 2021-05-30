package classeDate;

import java.util.Date;

public class AplicacaoDateLong {

        public static void main(String[] args) {

            System.out.println("Date(long date) -> Espera que passamos os milissegundos com base padrão de tempo\n" +
                    "\t\tque usa como referência 1 Janeiro de 1970 00:00:00");

            Long currentTimeMillis = System.currentTimeMillis();
            //System.currentTimeMillis();
            System.out.println("System.currentTimeMillis() -> Esse método vai retornar o milissegundo mais próximo\n" +
                    "\t\tde sua execução com base no Sitema Operacional.");
            System.out.println(currentTimeMillis);

            Date novaData = new Date(currentTimeMillis);
            System.out.println(novaData);
    }
}
