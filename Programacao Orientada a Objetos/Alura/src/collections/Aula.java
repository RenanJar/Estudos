package collections;

import java.util.Comparator;

public class Aula implements Comparator<Aula> {

        private String titulo;
        private int tempo;

        public Aula(String titulo, int tempo) {
            this.titulo = titulo;
            this.tempo = tempo;
        }


        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getTempo() {
            return tempo;
        }

        public void setTempo(int tempo) {
            this.tempo = tempo;
        }

        public String toString() {
            return "[título: " + titulo + ", tempo: " + tempo + " minutos]";
        }

    @Override
    public int compare(Aula o1, Aula o2) {
        return 0;
    }
}

