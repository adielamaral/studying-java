package academy.studyingjava.javacore.Gassociacao.domain;

public class ProfessorSeminario {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public ProfessorSeminario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public ProfessorSeminario(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Professor(a)/Palestrante: " + this.nome + " | Especialidade: " + this.especialidade);

        for (Seminario seminario : seminarios) {
            System.out.println("Tema do seminário: " + seminario.getTitulo());
            if (seminario.getLocal() == null || seminario.getLocal().getEndereco().length() == 0) {
                System.out.println("O seminário ainda não possui local definido");
            } else {
                System.out.println("Endereço: " + seminario.getLocal().getEndereco());
            }

            System.out.println("*** Lista de inscritos ***");

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
                System.out.println("Não há alunos inscritos neste seminário");
            }
            for (int i = 0; i < seminario.getAlunos().length; i++) {
                System.out.println(i + 1 + ". Nome: " + seminario.getAlunos()[i].getNome() + " | Idade: " + seminario.getAlunos()[i].getIdade() + " anos");
            }
//            for (Aluno aluno : seminario.getAlunos()) {
//                System.out.println("Nome: " + aluno.getNome() + " | Idade: " + aluno.getIdade() + " anos");
//            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
