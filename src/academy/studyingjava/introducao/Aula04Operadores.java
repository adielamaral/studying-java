package academy.studyingjava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        int soma = numero01 + numero02;
        System.out.println("Soma: " + soma);
        int subtracao = numero01 - numero02;
        System.out.println("Subtração: " + subtracao);
        int multiplicacao = numero01 * numero02;
        System.out.println("Multiplicação: " + multiplicacao);
        double divisao = (double) numero01 / numero02; // usando casting em um dos numeros
        System.out.println("Divisão: " + divisao);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // % (resto)
        int resto = 20 % 9;
        System.out.println("O resto da divisão é: " + resto);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // < > <= >= == !=
        boolean menorQue = 20 < 10;
        System.out.println("20 é MENOR que 10? Resposta: " + menorQue);
        boolean maiorQue = 20 > 10;
        System.out.println("20 é MAIOR que 10? Resposta: " + maiorQue);
        boolean menorOuIgual = 20 <= 10;
        System.out.println("20 é MENOR OU IGUAL a 10? Resposta: " + menorOuIgual);
        boolean maiorOuIgual = 20 >= 10;
        System.out.println("20 é MAIOR OU IGUAL a 10? Resposta: " + maiorOuIgual);
        boolean igual = 20 == 10;
        System.out.println("20 é IGUAL a 10? Resposta: " + igual);
        boolean diferente = 20 != 10;
        System.out.println("20 é DIFERENTE de 10? Resposta: " + diferente);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // && (AND) - || (OR) - ! (NOT)
        int idade = 29;
        double salario = 3500;
        boolean dentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean dentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da lei e maior que 30 anos? " + dentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei e menor que 30 anos? " + dentroDaLeiMenorQueTrinta);

        double saldoTotalContaCorrente = 200;
        double saldoTotalPoupanca = 10000;
        float valorPlaystation5 = 5000F;
        boolean comprarPlaystation5 = saldoTotalContaCorrente > valorPlaystation5 || saldoTotalPoupanca > valorPlaystation5;
        System.out.println("Consigo comprar o Playstation 5? " + comprarPlaystation5);
        boolean comprarPlaystation5Not = !(saldoTotalContaCorrente > valorPlaystation5 || saldoTotalPoupanca > valorPlaystation5);
        System.out.println(comprarPlaystation5Not);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // = += -= *= /= %=
        double bonus = 1800;
        System.out.println("Bonus = " + bonus);
        bonus += 1000;
        System.out.println("Bonus += 1000 = " + bonus);
        bonus -= 1000;
        System.out.println("Bonus -= 1000 = " + bonus);
        bonus *= 2;
        System.out.println("Bonus *= 2 = " + bonus);
        bonus /= 2;
        System.out.println("Bonus /= 2 = " + bonus);
        bonus %= 2;
        System.out.println("Bonus %= 2 = " + bonus);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // ++ (incremento) -- (decremento)
        int contador = 0;
        contador += 1; // contador = contador + 1;
        System.out.println("Contador = " + contador);
        contador++;
        System.out.println("Contador(++) = " + contador);
        contador--;
        System.out.println("Contador(--) = " + contador);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        int contador2 = 0;
        System.out.println("Contador2++ = " + contador2++);
        System.out.println("Contador2 = " + contador2);
        System.out.println("++Contador2 = " + ++contador2);
    }
}
