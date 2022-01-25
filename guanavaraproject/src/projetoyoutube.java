public class projetoyoutube {
    public static void main(String[] args) {

        Video v[]=new Video[2];
        v[0]=new Video("cursoPOO");
        v[1]=new Video("Destruindo a programação");


        Gafanhoto g[]=new Gafanhoto[2];
        g[0]=new Gafanhoto("Kleber",25,"M","Kleb40");
        g[1]=new Gafanhoto("Roger",18,"M","R0gerin");

        Visualizacao vis=new Visualizacao(g[0],v[0]);

        System.out.println(vis.toString());
        v[0].play();
        vis.avaliar(10);

        System.out.println(v[0]);

    }
}
