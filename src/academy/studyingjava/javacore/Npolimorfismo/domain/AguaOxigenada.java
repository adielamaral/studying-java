package academy.studyingjava.javacore.Npolimorfismo.domain;

public class AguaOxigenada extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.02;
    private String dataDeValidade;

    public AguaOxigenada(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto de Água oxigenada");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
