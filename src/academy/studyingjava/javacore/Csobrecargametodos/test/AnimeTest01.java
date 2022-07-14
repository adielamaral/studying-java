package academy.studyingjava.javacore.Csobrecargametodos.test;

import academy.studyingjava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 113, "Aventura");

        anime.imprime();
    }
}
