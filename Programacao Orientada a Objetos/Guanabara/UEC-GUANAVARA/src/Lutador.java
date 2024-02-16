import java.sql.SQLOutput;

public class Lutador {
    private String nome;
    private String nacinalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacinalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    public void apresentar(){
        System.out.println("apresentamos o lutador " +nome+ " vindo diretamente de " +nacinalidade+ " com "+vitorias+" vitorias, "+derrotas+ " derrotas e "+empates+" empates ");
    }
    public void status(){
        System.out.println("Lutador: "+nome);
        System.out.println("Nacionalidade: "+nacinalidade);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("Categoria :"+categoria);
        System.out.println("Vitorias: "+vitorias);
        System.out.println("Derrotas: "+derrotas);
        System.out.println("Empates: "+empates);

    }
    public void ganharluta(){
        vitorias+=1;
    }

    public void perderluta(){
        derrotas+=1;
    }

    public void empatarluta(){
        empates+=1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacinalidade() {
        return nacinalidade;
    }

    public void setNacinalidade(String nacinalidade) {
        this.nacinalidade = nacinalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (peso<52){
            this.categoria="Invalido";
        }
        else if(peso<=70.3){
            this.categoria="Leve";
        }
        else if(peso<=80){
            this.categoria="Medio";
        }
        else if(peso<=120){
            this.categoria="Pesado";
        }
        else{
            this.categoria="invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
