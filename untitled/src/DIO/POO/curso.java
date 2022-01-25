package DIO.POO;

public class curso extends Conteudo{

    int CargaHora;

    public int getCargaHora() {
        return CargaHora;
    }

    public void setCargaHora(int cargaHora) {
        CargaHora = cargaHora;
    }

    @Override
    public String toString() {
        return "curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", CargaHora=" + CargaHora +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP * CargaHora;
    }
}
