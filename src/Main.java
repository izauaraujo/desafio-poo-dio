import br.com.dio.desafio.dominio.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorario(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHorario(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dveloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Dveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.insvreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("------------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.insvreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
        System.out.println("conteudos Concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());



    }

}
