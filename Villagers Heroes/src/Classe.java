public abstract class Classe extends Personagem{


    public Classe(String nome, int força, int vitalidade, int inteligencia, int sorte) {
        super(nome, força, vitalidade, inteligencia, sorte);
    }

    public abstract void habilidades(String nome);
////alterar o nome da classe para ser uma classe especifica ex. classe lutador,classe mago, e extender a jogador...

}
