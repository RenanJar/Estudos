package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Aula aulaIntro = new Aula("Introdução às Coleções", 20);
        Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);
        Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);

        List<Aula> aulas = new ArrayList<Aula>();
        aulas.add(aulaIntro);
        aulas.add(aulaModelando);
        aulas.add(aulaSets);

        for (Aula aula : aulas) {
            System.out.println(aula);
        }
    }
}

