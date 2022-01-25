package DIO.POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class listordenada {
    public static void main(String[] args) {
        List<personagem> party = new ArrayList<>();{{
            party.add(new personagem("Samira","Pirata",7));
            party.add(new personagem("Joe","Cavaleiro",8));
            party.add(new personagem("Vitor","Clerigo",6));
            party.add(new personagem("Samira","Mago",7));

        }}
        System.out.println("ordem Padrao"+party);
        Collections.shuffle(party);
        System.out.println("ordem aleatoria"+party);
        Collections.sort(party, new Comparatorleveis());
        System.out.println("por ordem de Level"+party);
        Collections.sort(party, new ComparatorNomes());
        System.out.println("por ordem alfabetica"+party);



    }
}

class personagem implements Comparable<personagem>{
    private String Nome;
    private String Classe;
    private Integer level;

    public personagem(String nome, String classe, Integer level) {
        this.Nome = nome;
        this.Classe = classe;
        this.level = level;
    }

    public String getNome() {
        return Nome;
    }

    public String getClasse() {
        return Classe;
    }

    public Integer getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "classes{" +
                "Nome='" + Nome + '\'' +
                ", Classe='" + Classe + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    @Override
    public int compareTo(personagem personagem) {
        return this.getNome().compareToIgnoreCase(personagem.getNome());
    }
}

class Comparatorleveis implements Comparator<personagem>{

    @Override
    public int compare(personagem p1, personagem p2) {
        return Integer.compare(p1.getLevel(),p2.getLevel());
    }
}class ComparatorNomes implements Comparator<personagem>{

    @Override
    public int compare(personagem p1, personagem p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}