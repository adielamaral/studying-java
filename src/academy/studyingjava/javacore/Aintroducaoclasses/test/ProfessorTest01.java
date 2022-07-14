package academy.studyingjava.javacore.Aintroducaoclasses.test;

import academy.studyingjava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Linguiça";
        professor.idade = 42;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " | Idade: " + professor.idade + " anos" + " | Sexo: " + professor.sexo);
    }
}
