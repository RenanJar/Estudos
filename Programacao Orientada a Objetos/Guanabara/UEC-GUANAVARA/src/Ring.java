public class Ring {
    public static void main(String[] args) {

        Lutador lista[]=new Lutador[4];
        lista[0]= new Lutador("PrattryBoy","França",31,1.75f,68.9f,11,2,1);
        lista[1]=new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        lista[2]=new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        lista[3]=new Lutador("Dead Code","Australia",28,1.93f,81.6f,13,0,2);

        Luta UEC = new Luta();
        System.out.println(lista[0].getCategoria());
        System.out.println(lista[3].getCategoria());
        UEC.marcarLuta(lista[0],lista[3]);
        UEC.lutar();


    }
}
