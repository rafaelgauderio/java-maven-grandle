package tipos;

public class Wrappers {

    public static void main(String [] args) {

        System.out.println("Wrappers: São objetos que representam os primitivos");

        // Autoboxing: Apensar de ser um objeto, não precisei dar um new Byte(),
        // compilador sabe que tem que autoconstruir
        Byte b = 127; // É um classe
        Byte nullo = null; // possível atribuir valor nulo;

        Character caracter = 'A';
        Short pequeno;
        Integer inteiro;
        Long longo;
        Float flutuante;
        Double flutuanteDe64Bits;
        Boolean verdade = true;
        Boolean falso = false;

        Boolean verdadeiro = Boolean.getBoolean("true");
        Boolean boolean1 = Boolean.valueOf(false);



    }
}
