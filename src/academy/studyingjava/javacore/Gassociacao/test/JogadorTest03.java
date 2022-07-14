package academy.studyingjava.javacore.Gassociacao.test;

// Associação bidirecional

import academy.studyingjava.javacore.Gassociacao.domain.Jogador;
import academy.studyingjava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Daniel Alves");
        Jogador jogador2 = new Jogador("Piqué");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time("Barcelona");

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        jogador1.imprime();
        jogador2.imprime();

        System.out.println("----------------------------");

        time.imprime();
    }
}
