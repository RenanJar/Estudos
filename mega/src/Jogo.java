public class Jogo {

    int[] megasena= new int[6];
//realiza o sorteio dos numeros

    public void sorteio() {
        int k = 0;
        while (k <= 5) {
            int numeroaleatorio = (int) (Math.random() * 60);
            // verifica se o numero é igual a outro dentro dos arrays
            if (!possui(numeroaleatorio)) {
                megasena[k] = numeroaleatorio;
                k++;
            } else {
                k--;
            }
        }
    }
    public void mostrar(){
        for(int l=1;l<=megasena.length;l++){
            System.out.print(megasena[l-1]+" ");
        }
    }

    public boolean possui(int n){
        boolean resultado=false;
        for(int i=1;i<=6;i++){
            if (n==megasena[i-1]){
                resultado=true;
                break;

            }
        }
        return resultado;

    }
}

