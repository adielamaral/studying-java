package academy.studyingjava.javacore.Dconstrutores.test;

import academy.studyingjava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon ball", "TV", 232, "Artes marciais", "BKS");

        anime.imprime();
    }
}
