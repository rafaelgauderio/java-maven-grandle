package modificadores;

public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String coordenadas(int x, int y) {
        return "Construindo a figura geométrica usando x: " + x + ", y= " + y;
    }

}
