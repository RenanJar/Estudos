package DIO;
import java.util.Scanner;

public class Exercicio2Nota {
    public static void main(String[] args) {
        System.out.print("Por favor digite a nota do Aluno: ");
        Scanner imput = new Scanner(System.in);
        int nota = imput.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Numero invalido, por favor digitar um numero de 0 á 10");
            nota=imput.nextInt();
        }

        System.out.print("muito bem a nota do aluno digitada foi "+nota);
    }

}