public class Video implements AcaoVideo{

    private String titulo;
    private int avaliação;
    private int viwers;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliação=0;
        this.viwers=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(int avaliação) {
        int nova;
        nova=(this.avaliação+avaliação)/this.viwers;
        this.avaliação = nova;
    }

    public int getViwers() {
        return viwers;
    }

    public void setViwers(int viwers) {
        this.viwers = viwers;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curstidas) {
        this.curtidas = curstidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliação=" + avaliação +
                ", viwers=" + viwers +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }

    @Override
    public void play() {
        this.reproduzindo=true;

    }

    @Override
    public void pause() {
        this.reproduzindo=false;

    }

    @Override
    public void like() {
        this.curtidas++;

    }
}
