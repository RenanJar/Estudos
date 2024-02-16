package DIO;

public class Exercicio7ordeminversa {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6};

        int cont=0;

        while(cont<(vetor.length)){
            System.out.println(vetor[cont]+" ");
            cont+=1;
        }

        for(int i=(vetor.length-1);i>=0;i--) {
            System.out.println(vetor[i]+"");

        }


    }
}
