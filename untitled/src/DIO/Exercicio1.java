package DIO;
import java.text.BreakIterator;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        while(true)
            {
            System.out.println("Escreva seu Nome: ");
            String nome = entrada.next();
            System.out.println("Agora, escreva sua idade: ");
            int idade = entrada.nextInt();
            System.out.println("Muito bem, seu nome é " + nome + " e voce tem " + idade + " Anos");
            System.out.println("Digite S para continuar e N para sair: ");
            String resposta = entrada.next();

            if (resposta.equals("N")){
                break;
            }


            }
    }
   }

