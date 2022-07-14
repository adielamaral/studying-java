package academy.studyingjava.javacore.Gassociacao.test;

// Associação unidirecional muitos para um

import academy.studyingjava.javacore.Gassociacao.domain.Escola;
import academy.studyingjava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Johelden");
        Professor professor2 = new Professor("Erick");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Havard", professores);

        escola.imprime();
    }
}
