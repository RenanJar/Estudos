public class Principalfolhapagamento {
    public static void main(String[] args) {
        Folhapagamento folha=new Folhapagamento();
        double salario= folha.calcularsalario(160,12,32,2);

        System.out.println("Salario Calculado " +salario);
    }
}
