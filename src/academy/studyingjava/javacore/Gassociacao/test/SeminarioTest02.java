package academy.studyingjava.javacore.Gassociacao.test;

import academy.studyingjava.javacore.Gassociacao.domain.Aluno;
import academy.studyingjava.javacore.Gassociacao.domain.Local;
import academy.studyingjava.javacore.Gassociacao.domain.ProfessorSeminario;
import academy.studyingjava.javacore.Gassociacao.domain.Seminario;

import java.util.Scanner;

public class SeminarioTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(".:: GERENCIADOR DE SEMINÁRIOS ::.");

        System.out.println("Local / Endereço:");
        String endereco = input.nextLine();
        Local local = new Local(endereco);

        System.out.println("Nome do(a) aluno(a) inscrito(a):");
        String nomeAluno = input.nextLine();
        System.out.println("Idade do(a) aluno(a) inscrito(a):");
        String idadeAlunoString = input.nextLine();
        int idadeAluno = Integer.parseInt(idadeAlunoString);
        Aluno aluno = new Aluno(nomeAluno, idadeAluno);
        Aluno[] alunos = {aluno};

        System.out.println("Tema / Assunto:");
        String temaSeminario = input.nextLine();
        Seminario seminario = new Seminario(temaSeminario, alunos, local);
        Seminario[] seminarios = {seminario};

        System.out.println("Professor / Palestrante:");
        String nomeProfessor = input.nextLine();
        System.out.println("Especialidade do Professor / Palestrante:");
        String especialidadeDoProfessor = input.nextLine();
        ProfessorSeminario professor = new ProfessorSeminario(nomeProfessor, especialidadeDoProfessor, seminarios);

        professor.imprime();
    }
}
