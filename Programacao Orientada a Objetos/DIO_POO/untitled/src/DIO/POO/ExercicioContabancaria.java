package DIO.POO;

import java.util.Scanner;
import java.util.SortedMap;

public class ExercicioContabancaria {
    public static void main(String[] args) {
        ///menu
        System.out.println("Bem vindo ao Banco Jurosalto");
        Contabancaria joe = new Contabancaria(0, false);
        while(true) {
            System.out.println("Digite uma opção:");
            System.out.println("1 = Abertura de conta");
            System.out.println("2 = Deposito");
            System.out.println("3 = Saque");
            System.out.println("4 = Saldo");
            System.out.println("5 = Encerrar conta");
            System.out.println("6 = Sair");
            Scanner imput = new Scanner(System.in);
            int escolha = imput.nextInt();
            if (escolha == 1) {
                System.out.println("1- conta corrente");
                System.out.println("2- conta poupança");
                int escolhatipo = imput.nextInt();
                if (escolhatipo == 1) {
                    joe.tipo = true;
                } else {
                    joe.tipo = false;
                }
                joe.numero = 741852;
                System.out.println("Abertura concluida ");
                joe.setProprietario("Joe");
                System.out.println("numero da conta: " + joe.numero);
                System.out.println("nome do proprietario: " + joe.getProprietario());
                if (joe.tipo == true) {
                    System.out.println("Conta do tipo: Corrente");
                } else {
                    System.out.println("conta do tipo: Poupança");
                }
                System.out.println("1 sair/2 voltar ao menu");
                escolha = imput.nextInt();
                if (escolha == 1) {
                    break;
                } else ;


            } else if (escolha == 2) {
                if (joe.Status()==true) {
                    joe.depositar();
                    System.out.println("Deseja consultar o saldo?");
                    System.out.println("1-Sim / 2-Não");
                    int escolha1 = imput.nextInt();
                    if (escolha1 == 1) {
                        System.out.println("seu saldo é de : R$ " + joe.getSaldo());

                    } else ;
                    System.out.println("1 sair/2 voltar ao menu");
                    escolha = imput.nextInt();
                    if (escolha == 1) {
                        break;
                    } else ;
                }else{
                    System.out.println("conta invalida");
                }

            } else if (escolha == 3) {
                if (joe.Status()==true) {
                joe.sacar();
                System.out.println("Deseja consultar o saldo?");
                System.out.println("1-Sim / 2-Não");
                int escolha1 = imput.nextInt();
                if (escolha1 == 1) {
                    System.out.println("seu saldo é de : R$ " + joe.getSaldo());
                } else ;
                System.out.println("1 sair/2 voltar ao menu");
                escolha = imput.nextInt();
                if (escolha == 1) {
                    break;
                } else ;
                }else{
                    System.out.println("conta invalida");
                }
            } else if (escolha == 4) {
                if (joe.Status()==true) {
                System.out.println("seu saldo é de : R$ " + joe.getSaldo());
                System.out.println("1 sair/2 voltar ao menu");
                escolha = imput.nextInt();
                if (escolha == 1) {
                    break;
                } else ;
                }else{
                    System.out.println("conta invalida");
                }



            } else if (escolha == 5) {
                if (joe.getSaldo()==0){
                    joe.fecharconta();
                }else{
                    System.out.println("Erro verifique o saldo da sua conta");
                }



            }
            else if(escolha==6){
                System.out.println("obrigado por utilizar o banco Jurosalto");
                break;
            }
        }
    }
}



///melhorar o numero de linhas, ajustar os dados do cliente para guardar os dados em uma lista....