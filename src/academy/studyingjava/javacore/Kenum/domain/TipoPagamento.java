package academy.studyingjava.javacore.Kenum.domain;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // abstract foi criado para ser sobescrito @Override
    public abstract double calcularDesconto(double valor);
}
