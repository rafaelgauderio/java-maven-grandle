package classes.usuario;

public class SuperUsuario {
    private String login;
    private String senha;
    String nome;

    public SuperUsuario(String login) {
        this.login = login;
    }

    public SuperUsuario(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public SuperUsuario() {

    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login=login;

    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}