package DIO;
import java.util.Random;

public class exercicio9numerosaleatorios {
    public static void main(String[] args) {

        Random aleatorio= new Random();
        int[] numeros= new int[20];
        int contador=0;

        while((numeros.length)>contador){

            numeros[contador] = aleatorio.nextInt(100);
            System.out.print(numeros[contador]+" ");
            contador++;
        }
        contador=0;
        System.out.println("\n");

        while((numeros.length)>contador){
            System.out.print((numeros[contador]+1)+" ");
            contador++;
        }
        System.out.println("\n");
        contador=0;

        while((numeros.length)>contador){
            System.out.print((numeros[contador]-1)+" ");
            contador++;
        }
    }
}
