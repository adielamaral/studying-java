package academy.studyingjava.javacore.Gassociacao.test;

import academy.studyingjava.javacore.Gassociacao.domain.Aluno;
import academy.studyingjava.javacore.Gassociacao.domain.Local;
import academy.studyingjava.javacore.Gassociacao.domain.ProfessorSeminario;
import academy.studyingjava.javacore.Gassociacao.domain.Seminario;

/*
Crie um sistema que gerencie seminários

O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

- Um aluno poderá estar em apenas um seminário
- Um seminário poderá ter nenhum ou vários alunos
- Um professor poderá ministrar vários seminários
- Um seminário deve ter um local

--- Campos básicos (excluindo relacionamento) ---
Seminário: título
Aluno: nome e idade
Professor: nome e especialidade
Local: endereço

Aluno         1 - 1      Seminário

Seminário    1 - 0/N     Alunos

Professor     1 - N      Seminários

Seminário     1 - 1      Local
*/

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Estácio Belém - Av. Gov. José Malcher, 1148 - Nazaré");
        Aluno aluno1 = new Aluno("Adiel Amaral", 26);
        Aluno aluno2 = new Aluno("André da Silva", 24);
        Aluno[] turma1 = {aluno1, aluno2};
        Seminario seminario1 = new Seminario("Criptografias e segurança", turma1, local);
        Seminario[] seminarios = {seminario1};
        ProfessorSeminario professor1 = new ProfessorSeminario("Tadeu Silva", "Segurança digital", seminarios);

        professor1.imprime();
    }
}