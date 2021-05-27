package pessoa;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Float peso;

    public Pessoa () {

    }

    public Pessoa(String nome, Integer idade, Float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    protected String metodoRelatorio() {
        return "Nome: " + nome + ", idade: " + idade;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", idade= " + idade +
                ", peso= " + String.format("%.2f",peso) +
                '}';
    }
}
