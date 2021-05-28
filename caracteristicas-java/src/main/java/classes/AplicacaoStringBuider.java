package classes;

public class AplicacaoStringBuider {

    public static void main(String [] args) {

        String nome = "Rafael";

        final var builder = new StringBuilder(nome);
        System.out.println(builder.append(" De Luca"));

        final var reverse = builder.reverse();
        System.out.println(reverse);

        var insert = reverse.insert(0, "#").insert(reverse.length(),"#");
        System.out.println(insert);


    }
}
