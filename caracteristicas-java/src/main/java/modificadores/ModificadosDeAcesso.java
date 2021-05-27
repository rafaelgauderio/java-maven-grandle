package modificadores;

public class ModificadosDeAcesso {

    public static void main(String [] args) {

        System.out.println("public: Acessada de qualquer lugar por qualque entidade.");
        System.out.println("private: Usado apenas em métodos e atributos. " +
                "Não podem acessados e nem usados por nenhum outra classe, nem por herança");
        System.out.println("protected: Acessível para quem estiver no mesmo pacote. " +
                "Através da herança só pode acessar se estiver no mesmo package.");
        System.out.println("default: Classe e membros acessível apenas somente por classe do mesmo pacote.\n\t\t" +
                "Na sua declaração não é definido nenhum modificador pelo compilador.");
        System.out.println("Abstract: Não pode ser usado em variáveis. Apenas métodos e classes.\n" +
                "Uma classe abstrata não pode ser instanciada. Ela é apenas uma ideia de uma classe\n" +
                "Se algum método da classe for abstract a classe também deve ser abstract.");
    }
}
