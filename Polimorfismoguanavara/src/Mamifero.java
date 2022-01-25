public class Mamifero extends Animal{

    private String cordopelo;

    public String getCordopelo() {
        return cordopelo;
    }

    public void setCordopelo(String cordopelo) {
        this.cordopelo = cordopelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
}
