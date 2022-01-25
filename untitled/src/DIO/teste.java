package DIO;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite um numero:");
        int N= entrada.nextInt();
        for(int i=0;i<N;i++) {

            if (N == 0) {
                System.out.print("NULL");
            } else if (N % 2 == 0 && N > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (N % 2 == 0 && (N < 0)) {
                System.out.println("EVEN NEGATIVE");
            } else if (N % 2 != 0 && N > 0) {
                System.out.println("ODD POSITIVE");
            } else if (N % 2 != 0 && N < 0) {
                System.out.println("ODD NEGATIVE");

            }
        }
    }
}
