package academy.studyingjava.javacore.Npolimorfismo.service;

import academy.studyingjava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
