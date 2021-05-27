package tipos;

public class Primitivos {

    public static void main (String [] args) {
        // inteiros , não aceitam null e possuem valores default;
        byte b; // 8 bits
        byte b1 = 127;
        byte b2 = -128;

        char c; // 16 bits e apenas um único caracter;
        char c1= 'A';
        char c2 =50;

        short s; // 16 bits e não alta numérico;
        short s1 = 32767;
        short s2 = -32768;

        int i; // 32 bits
        int i1=2147483647;
        int i2=-2147483648;

        long l; // 32 bits

        // flutuantes

        float f1 = 65f; // 32 bits
        float f2= 65.0f;

        double d; // 64 bits
        double d1 = 1023232;

        //booleano
        // por default booleano é false

        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.println("void não é um tipo de variável é uma palavra reservada.");
        System.out.println("Posso declarar, mas se não inicializar a variável não consigo usar ela," +
                " dar um print por exemplo.\n\n");



    }
}
