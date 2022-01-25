package DIO.POO;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collectionteste {
    public static void main(String[] args) {

        System.out.println("introdução aos collections");
        System.out.println("crie 4 classes para os personagens");

        List<String> classes= new ArrayList<String>();
        List<Integer> leveis= new ArrayList<Integer>();

        classes.add("Cavaleiro");
        classes.add("Ladrão");
        classes.add("Mago");
        classes.add("Clerigo");

        System.out.println(classes);

        System.out.println("Em que posição a classe Ladrão se encontra ? ");

        System.out.println("a classe ladrao se encontra em :"+classes.indexOf("Ladrão"));

        System.out.println("substituindo a classe ladrao pela classe Pirata");
         classes.set(classes.indexOf("Ladrão"),"pirata");
        System.out.println(classes);
        System.out.println("apresentando os leveis dos personagens");

        leveis.add(5);
        leveis.add(6);
        leveis.add(7);
        leveis.add(2);
        leveis.add(10);
        System.out.println(leveis);

        System.out.println("maior nivel: "+ Collections.max(leveis));
        System.out.println("menor nivel: "+ Collections.min(leveis));

        leveis.remove(leveis.indexOf(10));
        System.out.println(leveis);

        Iterator<Integer> interator = leveis.iterator();
        int soma = 0;///variavel para somar os itens da lista///
        while(interator.hasNext()){
            int next = interator.next();
            soma+=next;
        }
        System.out.println("level da equipe: " +soma);
        int contador=0;

        while(contador<classes.size()) {

            System.out.println(classes.get(contador) + " level: " + leveis.get(contador));
            contador += 1;
        }









    }


}
