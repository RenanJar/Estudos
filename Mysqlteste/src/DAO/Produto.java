package DAO;

public class Produto {

    int id;
    String nome;
    String descrição;

    public Produto(String nome, String descrição) {
        this.nome = nome;
        this.descrição = descrição;
    }

    public Produto(Integer id,String nome, String descrição) {
        this.id=id;
        this.nome = nome;
        this.descrição = descrição;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("Produto: %d,%s,%s",
                this.id,this.nome,this.descrição);
    }
}
