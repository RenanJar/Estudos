package DIO;
import java.util.Scanner;
public class exercicio6fatorial {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        System.out.println("Por favor me diga um numero para que eu exiba seu fatorial: ");
        int fatorial=imput.nextInt();
        int cont=fatorial;
        int fatin=fatorial;

        while(cont>1){
            cont-=1;
            fatorial*=cont;
        }
        System.out.println(+fatin+"!="+fatorial);
    }
}
