package academy.studyingjava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean autorizacaoCompraBebidaAlcolica = idade >= 18;

        if (autorizacaoCompraBebidaAlcolica) {
            System.out.println("Compra de bebida alcólica autorizada.");

        // ! (NOT)
        }
        if (!autorizacaoCompraBebidaAlcolica) {
            System.out.println("Compra de bebida alcólica não autorizada.");
        }

        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do IF");
    }
}
