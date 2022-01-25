public class Escola {
    public static void main(String[] args) {

        Aluno a1=new Aluno();
        a1.setNome("Marcela");
        a1.setIdade(25);
        a1.setMatricula(2019);
        a1.setCurso("compliance");
        System.out.println(a1.toString());
        a1.pagarMensalidade();


        Professor p1=new Professor();
        p1.setNome("Carlos");
        p1.setEspecialidade("Risco");
        p1.setSalario(15000);
        p1.setSexo("M");
        p1.setIdade(55);
        p1.receberAumento();
        System.out.println(p1.toString());

        Bolsista b1=new Bolsista();
        b1.setNome("Marcio");
        b1.setMatricula(2019);
        b1.setCurso("Compliance");
        b1.setIdade(23);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();





    }
}
