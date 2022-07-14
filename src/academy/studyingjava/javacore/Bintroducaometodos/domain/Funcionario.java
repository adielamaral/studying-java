package academy.studyingjava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.println("Salário: R$ " + salario);
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }
        double somaSalarios = 0;
        for (double salarios : this.salarios) {
            somaSalarios += salarios;
        }
        System.out.println("Média salarial: R$ " + somaSalarios / this.salarios.length);
    }
}
