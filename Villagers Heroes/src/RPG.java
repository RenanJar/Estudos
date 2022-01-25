public class RPG {
    public static void main(String[] args) {
        jogador p1=new jogador("ZATAK",10,10,5,0,"Lutador",1,0,500);
        Enemy monstro=new Enemy("LOBAO",8,8,0,5);
        System.out.println(p1.toString());
        p1.habilidades("sequencia");
    }
}
