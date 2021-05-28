package modificadores;

public class ModificadosDeAcesso {

    public static void main(String [] args) {

        System.out.println("\npublic: Acessada de qualquer lugar por qualque entidade.");
        System.out.println("private: Usado apenas em métodos e atributos. " +
                "Não podem acessados e nem usados por nenhum outra classe, nem por herança");
        System.out.println("protected: Acessível para quem estiver no mesmo pacote. " +
                "Através da herança só pode acessar se estiver no mesmo package.");
        System.out.println("default: Classe e membros acessível apenas somente por classe do mesmo pacote.\n\t\t" +
                "Na sua declaração não é definido nenhum modificador pelo compilador.");
        System.out.println("Abstract: Não pode ser usado em variáveis. Apenas métodos e classes.\n" +
                "Uma classe abstrata não pode ser instanciada. Ela é apenas uma ideia de uma classe\n" +
                "Se algum método da classe for abstract a classe também deve ser abstract.");

        System.out.println("static: É usado para criação de uma variável que podeserá ser acessada por todas " +
                        "instâncias de objetos dessa classe como uma variável comum.\n\t\t"+"A variável criada " +
                        "será a mesma em todas as instâncias, quando o seu conteúdo é modificado " +
                        "numas das instãncias,\n\t\t a modificação é propagada em toda as demais instâncias.\n\t\t" +
                        "Nas declarações de métodos ajudam no acesso direto á classe, não é necessário" +
                "estanciar um objeto para acessar o método.");
        System.out.println("final: aplicanado na classe, não permite estender a classe\n\t\t" +
                "aplicado no método: impede que o mesmos eja sobrescrito na subclasse\n\t\t" +
                "aplicada em variáveis: impede que os valores das mesmas sejam alteradas");

    }
}
