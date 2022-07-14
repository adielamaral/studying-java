package academy.studyingjava.javacore.Npolimorfismo.test;

import academy.studyingjava.javacore.Npolimorfismo.repository.Repositorio;
import academy.studyingjava.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.studyingjava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import academy.studyingjava.javacore.Npolimorfismo.service.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }
}
