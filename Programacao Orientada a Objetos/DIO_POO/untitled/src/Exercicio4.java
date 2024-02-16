import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("digite o tipo do veiculo(caminhão ou passeio)");
        String tipoveiculo = entrada.nextLine();

        System.out.println("Digite a velocidade do veiculo");
        int radar = entrada.nextInt();

        int velmaxima = 80;

        if ((tipoveiculo.equals("passeio")&& radar>velmaxima*1.1)||(tipoveiculo.equals("caminhão")&& radar>velmaxima*1.05)){
            System.out.println("Multado ! ! ! ");
        }


    }
}
