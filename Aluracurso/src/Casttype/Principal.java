package Casttype;

public class Principal {
    public static void main(String[] args) {

        Personagem Percy = new Personagem("Percy");
        Percy.setNome("Percy");

        Object[] party= new Object[2];
        party[1]=Percy;
        party[0]=new Personagem("Roster");
        Personagem ref = (Personagem) party[1];

        System.out.println(((Personagem) party[1]));

    }
}
