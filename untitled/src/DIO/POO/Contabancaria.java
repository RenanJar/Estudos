package DIO.POO;

import java.util.Scanner;
public class Contabancaria {
//atributos
    public int numero;
    protected boolean tipo;
    private String proprietario;
    private float saldo;
    private boolean status;
    private Scanner entrada= new Scanner(System.in);

    public Contabancaria(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    //metodos
    public void abrirconta(){
        status=true;
        System.out.println("ABERTA");
    }

    public void fecharconta(){
        status=false;
        System.out.println("FECHADA");

    }

    public float depositar() {
            System.out.println("Digite o valor que deseja depositar: ");
            int deposito = entrada.nextInt();
            if (deposito < 0) {
                System.out.println("Erro!");
            } else {
                saldo += deposito;
            }
            return deposito;
    }

    public Integer sacar(){
        System.out.println("Digite o valor que deseja sacar: ");
        int saque=entrada.nextInt();
        if(saldo-saque<0){
            System.out.println("seu saldo é de: "+saldo+" por favor realizee outra operação");
        }
        else {
            saldo -= saque;
        }
        return saque;

    }

    public void mensalidade (){
        int mensal=7;
        System.out.println("sua mensalidade é de : "+mensal);
        saldo-=mensal;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean Status() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
}
