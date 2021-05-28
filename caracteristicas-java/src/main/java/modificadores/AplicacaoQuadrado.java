package modificadores;

public class AplicacaoQuadrado {

    public static void main (String [] args) {

        // formar geométrica não pode ser instanciado por ser uma classe abstrata, mas Quadrado pode
        //FormaGeometrica novaforma = new FormaGeometrica();

        final FormaGeometrica square= new Quadrado("quadrado",15.5);

        System.out.println(square);
        System.out.println(square.coordenadas(30,45));
        System.out.println(square.nome());
        System.out.println(square.area());








    }
}
