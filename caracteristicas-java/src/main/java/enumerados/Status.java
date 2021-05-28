package enumerados;

// enum podem ter atributos
public enum Status {
    OPEN(1,"ABERTO"),
    CLOSE(2,"FECHADO");

    private int cod;
    private String texto;

    Status(int cod, String texto) {
        this.cod=cod;
        this.texto=texto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
