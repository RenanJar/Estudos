public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricação;
    int comprimento;
    int largura;

    Proprietario proprietario;

    float areaocupacional(){
        float area= comprimento*largura;
        System.out.println(area);
        return area;
    }

    void ligar() {
        System.out.println("Ligando o CARRO ! ! ! ! "+ modelo);
    }
}
