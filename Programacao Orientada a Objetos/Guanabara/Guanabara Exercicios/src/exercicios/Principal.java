package exercicios;

public class Principal {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l=new Livro[2];

        p[0]=new Pessoa("Renan",25,true);
        p[1]=new Pessoa("Marcela",25,false);

        l[0]=new Livro("MACACOS ESPACIAIS","MACAQUES",200,0,false,p[0]);
        l[1]=new Livro("BAGATELA","Charles",300,0,false,p[1]);

        l[1].abrir();
        l[1].folhear(200);
        l[1].voltarPag();
        l[1].detalhes();
        System.out.println(l[1].detalhes());


    }
}
