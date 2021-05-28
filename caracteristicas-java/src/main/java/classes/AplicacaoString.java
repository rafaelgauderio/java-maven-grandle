package classes;

public class AplicacaoString  {

    public static void main (String [] args) {

        System.out.println("String é uma classe que está dentro do pacote java.lang" +
                "\nString representa uma sequência de caracteres.");
        var nome = "Rafael";
        var sobreNome = " De Luca";
        final var nomeCompleto = nome +sobreNome;

        var novaString = new String("     Texto para testar uma string      ");

        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(nomeCompleto);

        System.out.println(novaString);
        System.out.println("Char na posição 5 é " + novaString.charAt(5));
        System.out.println("Tamnaho da String: " + novaString.length());
        //trim remove os carateres em branco no final e inicio da string
        System.out.println("Com trim " + novaString.trim());
        System.out.println("minúsculo: " + novaString.toLowerCase());
        System.out.println("maiúsculo: " + novaString.toUpperCase());
        System.out.println("contem letra t: " +novaString.contains("t"));
        System.out.println("contém letra w: "+ novaString.contains("w"));
        System.out.println("reclace a por i " + novaString.replace("a","i"));








    }

}
