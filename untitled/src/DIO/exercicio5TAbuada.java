package DIO;
import java.util.Scanner;
public class exercicio5TAbuada {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        System.out.println("Me diga uma Tabuada que deseja ver:");
        int tabuada=imput.nextInt();
        int contador=0;

        for(int i =0;i<=10;i+=1){

            System.out.print(+tabuada+" x "+contador+" = "+tabuada*contador+"\n");
            contador+=1;

        }
    }
}
