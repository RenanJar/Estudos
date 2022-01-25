public class Personagem{

    private String nome;
    private int força;
    private int vitalidade;
    private int inteligencia;
    private int sorte;

    public Personagem(String nome, int força, int vitalidade, int inteligencia, int sorte) {
        this.nome = nome;
        this.força = força;
        this.vitalidade = vitalidade;
        this.inteligencia = inteligencia;
        this.sorte = sorte;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", força=" + força +
                ", vitalidade=" + vitalidade +
                ", inteligencia=" + inteligencia +
                ", sorte=" + sorte +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    private void atacar(){
        int atq=(força+inteligencia)/2;
    System.out.println("Atacou ! ");
}
private void HP() {
    int HP= vitalidade*10;
    }

}
