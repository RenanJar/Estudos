package DIO;
import java.util.Scanner;
public class Exercicio3maioremedia {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        int cont= 0;
        int maior= 0;
        int media=0;


        while(cont < 5){
            System.out.print("Digite um numero: ");
            int numero=imput.nextInt();
            cont +=1;
            media+=numero;

            if (numero> maior){
                maior = numero;
            }


        }
        System.out.print("O maior numero foi "+maior+" e a media dos numeros  digitados foram: "+media/5);
    }
}
