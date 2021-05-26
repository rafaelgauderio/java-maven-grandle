package tipos;

public class NaoPrimitivos {

    public static void main(String [] args) {

        // São basicamento 4
        // String, Number, Object, Qualquer outros Objetos
        // Tudo é objeto no java menos o tipos primitivos

        String texto = "Rafael De Luca"; //sequencia de caracteres
        Void vazio; // Tipo válido
        Object objeto = new Object();
        Number numero = Integer.valueOf(500);
        // Integer extends Number;
        numero.toString();

    }
}
