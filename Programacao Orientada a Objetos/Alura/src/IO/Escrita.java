package IO;

import java.io.*;

public class Escrita {

    public static void main(String[] args) throws IOException {

        FileOutputStream arquivo=new FileOutputStream("Arquivoescrito.txt");
        OutputStreamWriter escritabytes=new OutputStreamWriter(arquivo);
        BufferedWriter escrita= new BufferedWriter(escritabytes);

        escrita.write("MVC Model View Control");
        escrita.newLine();
        escrita.newLine();
        escrita.write("è um modelo padrao de arquitetura ultilizado para desenvolvimento web");
        escrita.close();
    }
}
