package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SimplificandoEscrita {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter escrita = new PrintWriter("Arquivoescrito.txt");

        escrita.println("ALO ALO ALO GAROTADA");
        escrita.println();
        escrita.println();
        escrita.println("Aquele ABRAÇOOOOO!!!!");
        escrita.close();

    }
}
