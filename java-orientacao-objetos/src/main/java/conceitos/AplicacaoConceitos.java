package conceitos;

public class AplicacaoConceitos {
    public static void main (String [] args ) {

        System.out.println("Códigos procedurais: Escolher o melhor algoritmo é o mais importante.\n" +
                "Linguagens Orientadas a Objetos: Projeto de classes e como se encaixam é o mais importante.\n" +
                "Classe: É uma espécie de molde que funciona como base para construir algo concreto.\n" +
                "Objeto: É uma instância de Classe. Em uma analagia uma planta (projeto) de uma casa seria\n" +
                "\t\ta Classe e a casa construida seria o objeto.\n" +
                "\t\tPodemos criar vários objetos a partir de uma mesma casa. Sérias as instâncias de classe.\n" +
                "Atributos: Seriam as caracterisiticas da Classe. Exemplo uma classe Pessoa tem nome e idade como atributos.\n" +
                "Métodos: Seriam as ações, funções. Exemplo, classe Pessoa pode ter o método andar, respirar, falar.\n" +
                "Constutores: Usados para construir objetos baseados em uma classe e assim alocarmos em memória.\n" +
                "\t\tao criarmos um objetos estamos instanciando um objeto.\n" +
                "\t\tNo java se não criarmos um construtor explicidamente, ele fica omitido. Conseguimos instancias um objeto\n" +
                "\t\tsem parâmetros, como se fosse instanciado a partir de um construtor vazio.\n" +
                "No java não temos um destrutor, quem faz a função de desalocar objetos é Garbage Colector.\n" +
                "Herança: capacidade de uma Classe herdar o comportamento de outra.\n" +
                "\t\tAlguns autores defendemq ue herança nunca deve ser usada. Recomendam a composição, visto que\n" +
                "\t\t na herança a subclasse necessita conhecer a implementação da superclasse, o que ciar um\n" +
                "\t\tacoplamento e quebra a premissao básica do isolamento do encapsulamento.\n" +
                "Polimorfismo: uma mesma ação que pode ser comum a duas classes diferentes, essa ação pode ter peculiaridades.\n" +
                "\t\tpolimorfismo nos garante a capacidade de um objeto ser referenciado de multiplas formas.\n " +
                "\t\texemplos, ambos as Classes moto e carro podem ter o método acelera implemenado de maneira diferente.\n" +
                "");

        Encapsulamento dadosencapsulados = new Encapsulamento();
        dadosencapsulados.encapsular();
    }




}
