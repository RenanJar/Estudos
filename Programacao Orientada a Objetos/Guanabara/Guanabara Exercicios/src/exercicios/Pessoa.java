package exercicios;

public class Pessoa {

    private String nome;
    private int idade;
    private boolean sexo;
    public void fazerAniver(){
        this.idade++;

    }

    public Pessoa(String nome, int idade, boolean sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}
