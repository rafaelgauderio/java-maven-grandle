package tipos;

public class TipoInferido {

    public static void main(String [] args) {

        //Permite criar variaveis sem dizer explicitamente o tipo
        // usando a palavra reservada var

        var numero = Integer.valueOf(35);

        var texto = "O número inteiro é ";

        System.out.println(texto + numero);



    }

}
