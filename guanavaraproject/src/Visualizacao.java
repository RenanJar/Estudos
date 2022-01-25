public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme= filme;
        this.espectador.setTotalAsssistido(this.espectador.getTotalAsssistido()+1);
        this.filme.setViwers(this.filme.getViwers()+1);
    }

    public void avaliar(){
        this.filme.setAvaliação(5);

    }
    public void avaliar(int nota){
        this.filme.setAvaliação(nota);

    }
    public void avaliar(float porc){
        int tot =0;
        if (porc>=20){
            tot = 3;
        }
        else{
            tot = 1;
        }
        this.filme.setAvaliação(tot);

    }
}
