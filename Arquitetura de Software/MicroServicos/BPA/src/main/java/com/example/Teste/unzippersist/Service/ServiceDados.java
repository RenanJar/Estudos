package com.example.Teste.unzippersist.Service;
import com.example.Teste.unzippersist.Repository.InformacoesTrimestraisBalancoPatrimonialConsolidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

@Service
public class ServiceDados {

    @Autowired
    InformacoesTrimestraisBalancoPatrimonialConsolidadoRepository
            informacoesTrimestraisBalancoPatrimonialConsolidadoRepository;

    @Autowired
    InformacoesTrimestraisBalancoPatrimonialConsolidadoService
            informacoesTrimestraisBalancoPatrimonialConsolidadoService;

    public Path leitorZip() throws IOException {
        byte[] buffer = new byte[2048];

        Path outDir = Paths.get("/home/userlinux/Área de Trabalho/Codes/Projetos/teste/");
        String zipFileName = "/home/userlinux/Área de Trabalho/Codes/Projetos/teste/itr_cia_aberta_2022.zip";
        Path output = null;

        List<String> teste = Arrays.asList("itr_cia_aberta_BPA_con_2022.csv",
                "itr_cia_aberta_BPP_con_2022.csv","itr_cia_aberta_DRE_con_2022.csv");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(zipFileName));
             ZipInputStream stream = new ZipInputStream(bufferedInputStream)) {
            ZipEntry entry;
            String BPA = "itr_cia_aberta_BPA_con_2022.csv";

            while ((entry = stream.getNextEntry()) != null) {
                Path filePath = outDir.resolve(entry.getName());

                if(teste.contains(entry.getName())) {

                    Path temp = Files.createTempFile(outDir,entry.getName(), ".csv");
                    output = temp.toAbsolutePath();

                    try (FileOutputStream fos = new FileOutputStream(temp.toFile());
                         BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {
                        int len;
                        while ((len = stream.read(buffer)) > 0) {
                            bos.write(buffer, 0, len);
                        }
                    }
                }
            }
        }
        return output;
    }

    public void leitorCsv(Path path, List<String> cnpj) throws IOException{
        Files.lines(path, StandardCharsets.ISO_8859_1)
                .skip(1)
                .map(line -> informacoesTrimestraisBalancoPatrimonialConsolidadoService
                        .separarString(line))
                .filter(objeto -> cnpj.contains(objeto.getCnpjCia()))
                .forEach(objetofiltrado -> informacoesTrimestraisBalancoPatrimonialConsolidadoRepository
                        .save(objetofiltrado));
        Files.delete(path);
    }


}
