package DIO;
import java.util.Scanner;
public class exercicio4parimpar {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int pares=0;
        int impares=0;

        while(true){
            System.out.print("Digite um numero:");
            int numero=imput.nextInt();

            if (numero%2 == 0)
                pares+=1;
            else
                impares+=1;

            System.out.println("Deseja digitar um numero? S/N");
            String resposta= imput.next();

            if(resposta.equals("N"))
                break;
        }
        System.out.print("Voce digitou "+pares+" numeros pares e "+impares+" numeros impares");
    }
}
