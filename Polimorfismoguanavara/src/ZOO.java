public class ZOO {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        PeixeDourado peixe= new PeixeDourado();
        Canguru cang= new Canguru();

        System.out.println("CACHORRO");
        dog.setIdade(8);
        dog.setCordopelo("marrom");
        dog.setMembros(4);
        dog.setPeso(80);
        System.out.println("-------------------");
        dog.reagir(11,0);
        dog.reagir(19,0);
        dog.reagir(true);
        dog.reagir(false);
        dog.reagir("Toma comida");
        dog.reagir("Olá");
        dog.alimentar();
        dog.emitirSom();
        dog.locomover();
        System.out.println("-------------------");


        System.out.println("Canguru");
        cang.setCordopelo("branco");
        cang.setIdade(7);
        cang.emitirSom();
        cang.setPeso(90);
        cang.alimentar();
        cang.locomover();

        System.out.println("Peixe");
        peixe.alimentar();
        peixe.locomover();
        peixe.douradao();
        peixe.emitirSom();
        peixe.soltarbolhas();
        peixe.setPeso(5);
        peixe.setMembros(0);
        peixe.setCordaescama("dourada");

    }
}
