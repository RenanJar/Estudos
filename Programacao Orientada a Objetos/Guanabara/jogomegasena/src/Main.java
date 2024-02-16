import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Jogo jogo=new Jogo();
jogo.sorteio();
        System.out.println("Quantos jogos da mega sena deseja gerar?");
        Scanner imput=new Scanner(System.in);
        int n=imput.nextInt();
        int c=0;
        while (c<n){
            System.out.println("");
            jogo.embaralhar();
            jogo.mostrar();
            c++;
        }



    }
}
