package academy.studyingjava.javacore.Npolimorfismo.service;

import academy.studyingjava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
