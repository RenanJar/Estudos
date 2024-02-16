public class Peixe extends Animal{


    private String Cordaescama;

    public String getCordaescama() {
        return Cordaescama;
    }

    public void setCordaescama(String cordaescama) {
        Cordaescama = cordaescama;
    }

    public void soltarbolhas(){
        System.out.println("soltando bolhas");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("substancias marinhas");

    }

    @Override
    public void emitirSom() {
        System.out.println("nao emite sons");

    }
}
