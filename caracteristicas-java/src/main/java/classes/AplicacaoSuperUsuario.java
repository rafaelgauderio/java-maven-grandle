package classes;

public class AplicacaoSuperUsuario {
    public static void main(String [] args) {

        final var superUsuario = new SuperUsuario();

        superUsuario.setLogin("root");
        System.out.println(superUsuario.getLogin());

        superUsuario.setSenha("123456");
        System.out.println(superUsuario.getSenha());

        //setar a variavél root
        String root = superUsuario.nome.toUpperCase();





    }
}
