public class Principal {
    public static void main(String[] args) {
        Carro meucarro;// declaramos a variavel Carro
        meucarro = new Carro();// Instanciamos a variavel com um objeto do tipo Carro
        meucarro.modelo= "Celta";
        meucarro.anoDeFabricação=2015;
        meucarro.cor="Preto";
        meucarro.fabricante="Chevrolet";
        meucarro.comprimento= 10;
        meucarro.largura=20;
        meucarro.ligar();


        Proprietario proprietariocelta= new Proprietario();

        proprietariocelta.Nomecompleto="Renan Oliveira do Nascimento";
        proprietariocelta.Sexo="Masculino";



        Carro seucarro= new Carro();

        seucarro.modelo="Palio";
        seucarro.cor="prata";
        seucarro.anoDeFabricação=2000;
        seucarro.fabricante="Fiat";
        seucarro.ligar();

        Proprietario proprietarioPalio= new Proprietario();
        proprietarioPalio.Nomecompleto= "Marcela Barioto Celestino";
        proprietarioPalio.Sexo="Feminino";

        System.out.println("proprietario: "+ proprietariocelta.Nomecompleto);
        System.out.println("Sexo: "+proprietariocelta.Sexo);
        System.out.println("modelo: "+meucarro.modelo);
        System.out.println("Ano: "+meucarro.anoDeFabricação);
        System.out.println("cor" + meucarro.cor);
        System.out.println("fabricante: "+meucarro.fabricante);
        System.out.println("Area ocupacional do veiculo em m² "+meucarro.areaocupacional());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("proprietario: "+ proprietarioPalio.Nomecompleto);
        System.out.println("Sexo: "+proprietarioPalio.Sexo);
        System.out.println("modelo:"+seucarro.modelo);
        System.out.println("Ano: "+seucarro.anoDeFabricação);
        System.out.println("Cor: "+seucarro.cor);
        System.out.println("fabricante: "+seucarro.fabricante);



    }
}
