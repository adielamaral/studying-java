package academy.studyingjava.javacore.Eblocosinicializacao.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private char sexo;
    private double[] salario;

    {
        System.out.println("### Cálculo da média salarial dos últimos 3 meses do colaborador ###");
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Funcionario(String nome, int idade, char sexo) {
        this(nome, idade);
        this.sexo = sexo;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");

        switch (this.sexo) {
            case 'M':
                System.out.println("Sexo: Masculino");
                break;
            case 'F':
                System.out.println("Sexo: Feminino");
                break;
            default:
                System.out.println("Sexo: Outro");
                break;
        }

        for (double salarios : this.salario) {
            if (this.salario.length > 3) {
                return;
            } else {
                System.out.println("Salario: R$ " + salarios);
            }
        }
        mediaSalarial();
    }

    private void mediaSalarial() {
        double somaSalarios = 0;
        for (double salarios : this.salario) {
            somaSalarios += salarios;
        }
        System.out.println("Média salarial: R$ " + somaSalarios / this.salario.length);
    }

    public String getNome() {
        return this.nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public int getIdade() {
        return this.idade;
    }

//    public void setIdade(int idade) {
//        this.idade = idade;
//    }

    public double[] getSalario() {
        return this.salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
