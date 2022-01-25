package DIO.POO;

public abstract class Conteudo {

    protected final double XP= 10d;

    private String titulo;
    private String descrição;

    public abstract double calcularXP();

    public double getXP() {
        return XP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}
