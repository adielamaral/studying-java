package academy.studyingjava.javacore.Jmodificadorfinal.domain;

public class Carro {
    //Posso definir como 'final' a classe Carro se eu não quiser que nenhuma outra classe estenda (seja filha) ela. Ex: public final class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
