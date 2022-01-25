package IO;

import java.io.*;

public class Leitura {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("Arquivo.txt"); //lê o arquivo
        InputStreamReader filebytes= new InputStreamReader(file);//Transforma o arquivo em bites
        BufferedReader Leitor = new BufferedReader(filebytes);
        String linha= Leitor.readLine();

        while(linha!=null) {

            System.out.println(linha);
            linha= Leitor.readLine();
        }
        Leitor.close();

    }
}
