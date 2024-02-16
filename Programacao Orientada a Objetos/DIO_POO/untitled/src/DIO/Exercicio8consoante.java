package DIO;

public class Exercicio8consoante {
    public static void main(String[] args) {

        String[] vetor = {"m", "a", "r", "c", "e", "l","a"};
        int contador = 0;
        int contvogal = 0;

        while ((vetor.length) > contador) {

            if (!((vetor[contador]).equals("a") || (vetor[contador]).equals("e") || (vetor[contador]).equals("i") || (vetor[contador]).equals("o") || (vetor[contador]).equals("u"))) {
                System.out.println(vetor[contador]);
                contvogal++;
            }
            contador++;

        }
        System.out.println("foram exibidas "+contvogal+" consoantes");
    }
}
