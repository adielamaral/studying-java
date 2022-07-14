package academy.studyingjava.javacore.Npolimorfismo.domain;

public class Celular extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.08;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Celular");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
