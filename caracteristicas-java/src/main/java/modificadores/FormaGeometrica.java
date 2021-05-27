package modificadores;

public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String coordenadas(int x, int y) {
        return "Fazendo a figura geométrica usando x: " + x + ", y= " + y;
    }

}
