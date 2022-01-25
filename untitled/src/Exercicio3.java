import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ano:");

        int ano = entrada.nextInt();

        if (ano % 400 == 0) {// todos os multiplos de 400 sao bissextos
            System.out.println("o Ano\"" + ano + "\" é um ano bissexto");
        } else if (ano % 4 == 0) {
            if (ano % 100 != 0) {//Multiplo de 4 e não multiplo de 100 sao bissextos
                System.out.println("O ano \"" + ano + "\"não é um ano bissexto");
            }
        } else {
            System.out.println("O ano\"" + ano + "\"não é um ano bissexto");
        }
    }
}
