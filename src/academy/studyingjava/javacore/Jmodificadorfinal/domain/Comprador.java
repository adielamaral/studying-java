package academy.studyingjava.javacore.Jmodificadorfinal.domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Nome do comprador: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
