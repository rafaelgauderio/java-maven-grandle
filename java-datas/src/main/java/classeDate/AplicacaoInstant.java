package classeDate;

import java.time.Instant;
import java.util.Date;

public class AplicacaoInstant {

    public static void main(String[] args) {

        System.out.println("Conversão de Date para Instant\n" +
                "Isntant é mais moderno, imutável e Thread safe\n" +
                "Modela um ponto instantâneo de uma linha de tempo.");
        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z
    }
}
