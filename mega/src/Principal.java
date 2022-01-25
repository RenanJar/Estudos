import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("por favor, quantos jogos vc deseja ver:");
        Scanner imput=new Scanner(System.in);
        Jogo jogo=new Jogo();
        int n=imput.nextInt();
        for(int l=0;l<n;l++) {
            jogo.sorteio();
            jogo.mostrar();
            System.out.println("\n");
        }
    }
}
