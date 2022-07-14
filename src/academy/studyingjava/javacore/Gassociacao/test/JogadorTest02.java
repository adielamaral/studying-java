package academy.studyingjava.javacore.Gassociacao.test;

import academy.studyingjava.javacore.Gassociacao.domain.Jogador;
import academy.studyingjava.javacore.Gassociacao.domain.Time;

// Associação unidirecional um para muitos

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Vinícius Júnior");
        Jogador jogador3 = new Jogador("Neymar Jr");

        Time time1 = new Time("Paris Saint-Germain");
        Time time2 = new Time("Real Madrid");

        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time1);

        jogador1.imprime();
        jogador3.imprime();
        jogador2.imprime();
    }
}
