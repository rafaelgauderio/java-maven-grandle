package pessoa;

import classes.SuperUsuario;

public class AplicacaoUsuario {
    public static void main(String [] args) {

        final var rafael = new SuperUsuario();
        final var deluca = new SuperUsuario("Rafael De Luca","@123456*");
        rafael.setNome("Rafael");
        rafael.setSenha("hygie123*");
        rafael.setLogin("rafael1712");

        System.out.println("Não consigo acessar o método getSenha(), pois está em outro pacote é foi defindo como protected.");
        System.out.println("login: " + rafael.getLogin() + ", Nome: " + rafael.getNome());

        System.out.println(deluca.toString());

        }
}
