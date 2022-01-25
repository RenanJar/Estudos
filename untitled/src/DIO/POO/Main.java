package DIO.POO;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        curso curso1 =new curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Curso de java");
        curso1.setCargaHora(8);

        curso curso2=new curso();
        curso2.setTitulo("Cuso de JS");
        curso2.setDescrição("Curso de JS");
        curso2.setCargaHora(5);

        mentoria mentoria1=new mentoria();
        mentoria1.setTitulo("Mentoria em JAVA");
        mentoria1.setDescrição("Mentoria voltadaa linguagem Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1=new Bootcamp();
        bootcamp1.setNome("Bootcamp Java DEV");
        bootcamp1.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devCamila=new Dev();
        devCamila.setNome("camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos inscritos"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos"+devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devCamila.getConteudosConcluidos());

        System.out.println("----------------------");

        Dev devjoao= new Dev();
        devjoao.setNome("Joao");
        devjoao.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos inscritos"+devjoao.getConteudosInscritos());
        devjoao.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos"+devjoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devjoao.getConteudosConcluidos());
        System.out.println("XP" +devjoao.calculartotalxp());

    }
}
