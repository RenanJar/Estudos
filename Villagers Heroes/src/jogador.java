public class jogador extends Classe{

    public jogador(String nome, int força, int vitalidade, int inteligencia, int sorte, String classe, int level, int xpatual, int xpproxnivel) {
        super(nome, força, vitalidade, inteligencia, sorte);
        this.classe = classe;
        this.level = level;
        this.xpatual = xpatual;
        this.xpproxnivel = xpproxnivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXpatual() {
        return xpatual;
    }

    public void setXpatual(int xpatual) {
        this.xpatual = xpatual;
    }

    public int getXpproxnivel() {
        return xpproxnivel;
    }

    public void setXpproxnivel(int xpproxnivel) {
        this.xpproxnivel = xpproxnivel;
    }

    private String classe;
    private int level;
    private int xpatual;
    private int xpproxnivel;


    @Override
    public String toString() {
        return "jogador{" +
                "nome= " + getNome() + '\'' +
                ", força= " + getForça() +
                ", vitalidade= " + getVitalidade() +
                ", inteligencia= " + getInteligencia() +
                ", sorte= " + getSorte() +
                ", classe= " + classe + '\'' +
                ", level= " + level +
                ", xp atual= " + xpatual +
                ", xp para o proximo nivel= " + xpproxnivel +
                '}';

    }

    @Override
    public void habilidades(String nome) {
        level=getLevel();
        if (level>=1){
            nome="Sequencia";
            System.out.println("habilidade conjurada: "+nome+" Esquerda, Esquerda, DIREITA!!!");
        }
    }
}
