package classeDate;

import java.util.Date;

public class AplicacaoExercicio {
    public static void main(String [] args ) {


        AplicacaoExercicio exercicio = new AplicacaoExercicio();
        exercicio.checarLong(1563385317992L);
        exercicio.dateToLong();


    }

    public Date checarLong(long epoch)
    {
        Date date = new Date(1563385317992L);
        System.out.println(date);
        return null;
    }

    public long dateToLong() {

        return 0L;
    }


}

