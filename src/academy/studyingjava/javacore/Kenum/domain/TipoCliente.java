package academy.studyingjava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int id;
    private String tipo;

    TipoCliente(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public static TipoCliente tipoClientePeloNomeDoAtributo(String nomeDoTipo) {
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getTipo().equals(nomeDoTipo)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
