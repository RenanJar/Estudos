package DIO;
import java.util.Random;
public class Exercicio10multidimensional {
    public static void main(String[] args) {

        int[][] multi= new int[4][4];
        Random random= new Random();
        int contadorL=0;
        int contadorC=0;

        while(contadorL<4){
            ///gera coluna


            while(contadorC<4){
                ///gera linha

                multi[contadorL][contadorC]=random.nextInt(9);
                System.out.print(multi[contadorL][contadorC]+" ");
                contadorC++;

            }
            System.out.println(" ");
        contadorC=0;
        contadorL++;
        }
    }
}
