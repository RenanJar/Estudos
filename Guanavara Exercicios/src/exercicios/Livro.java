package exercicios;

public class Livro implements Publicação{

    private String titulo;
    private String autor;
    private int totalpag;
    private int pagatual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalpag, int pagatual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalpag = totalpag;
        this.pagatual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(int totalpag) {
        this.totalpag = totalpag;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
///metodos
/// como usamos um vetor pra instanciar os objetos, utilizamos o- to string para exibilas, ja que o java retorna um local de memoria quando tentamos exibir o vetor requisitado.
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalpag=" + totalpag +
                ", pagatual=" + pagatual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto=true;

    }

    @Override
    public void fechar() {
        this.aberto=false;

    }

    @Override
    public void folhear(int p) {
        this.pagatual=p;
        if(p>getTotalpag()){

            this.pagatual=0;
        }

    }

    @Override
    public void avançarPag() {
        this.pagatual++;
    }

    @Override
    public void voltarPag() {
        this.pagatual--;
    }
}
