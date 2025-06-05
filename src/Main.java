import br.com.dio.desafio.dominio.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHorario(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHorario(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao da mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Izaú");
        dev1.insvreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Izaú"+ dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Izaú"+ dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Izaú"+ dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("------------");


        Dev dev2= new Dev();
        dev2.setNome("Joao");
        dev2.insvreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Joao"+ dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("conteudos Inscritos Joao"+ dev2.getConteudosInscritos());
        System.out.println("conteudos Concluidos Joao"+ dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());



    }

}
