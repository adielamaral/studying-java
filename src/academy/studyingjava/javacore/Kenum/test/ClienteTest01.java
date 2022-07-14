package academy.studyingjava.javacore.Kenum.test;

import academy.studyingjava.javacore.Kenum.domain.Cliente;
import academy.studyingjava.javacore.Kenum.domain.TipoCliente;
import academy.studyingjava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        // valueof - Ele retorna um valor baseado no nome do enum (ele retorna o enum)
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        // (ele retorna o enum)
        // System.out.println(tipoCliente);
        System.out.println(tipoCliente.getTipo());

        // Busca o enum pelos atributos
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePeloNomeDoAtributo("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
