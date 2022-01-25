import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {

    List numeros = new ArrayList();

    public void sorteio(){
        for(int i=1;i<61;i++){
            numeros.add(i);
        }
    }
    public void mostrar(){
        for(int i=0;i<6;i++){
            System.out.print(numeros.get(i)+" ");
        }

    }
    public void embaralhar(){
        Collections.shuffle(numeros);
    }

}
