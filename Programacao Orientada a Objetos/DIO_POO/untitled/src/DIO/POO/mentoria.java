package DIO.POO;

import java.time.LocalDate;

public class mentoria extends Conteudo {


    private LocalDate Data;


    @Override
    public double calcularXP() {
        return XP + 20d;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", Data=" + Data +
                '}';
    }
}
