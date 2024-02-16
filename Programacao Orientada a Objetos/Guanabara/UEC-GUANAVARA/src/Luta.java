import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!= l2){
    this.aprovada = true;
    this.desafiado=l1;
    this.desafiante=l2;
        }else{
            this.aprovada = false;
            this.desafiante=null;
            this.desafiado=null;
        }

    }
    public void lutar(){
        if (this.aprovada==true){
            System.out.println("-=-=-=-=-=-DESAFIADO-=-=-=-=-=-");
            this.desafiado.apresentar();
            System.out.println("-=-=-=-=-=-DESAFIANTE-=-=-=-=-=-");
            this.desafiante.apresentar();
            Random aleatorio=new Random();
            int vencedor = aleatorio.nextInt(3);//0 1 2
            if (vencedor==0){
                System.out.println("Empate!!!");
                this.desafiante.empatarluta();
                this.desafiado.empatarluta();
            }
            else if(vencedor ==1){
                System.out.println(desafiado.getNome()+"VEEEEEENCEU!!!!!!!!!!!!!");
                this.desafiado.ganharluta();
                this.desafiante.perderluta();
            }else{
                System.out.println(desafiante.getNome()+"VEEEEEENCEU!!!!!!!!!!!!");
                this.desafiante.ganharluta();
                this.desafiado.perderluta();
            }

        }else{
            System.out.println("A luta nao pode acontecer");
        }

    }

}

