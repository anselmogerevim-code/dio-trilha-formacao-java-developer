package one.digitalinovation;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import one.digitalinovation.dominio.Bootcamp;
import one.digitalinovation.dominio.Conteudo;
import one.digitalinovation.dominio.Curso;
import one.digitalinovation.dominio.Dev;
import one.digitalinovation.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Básico");
        cursoJavaBasico.setDescricao("Aprenda os conceitos básicos sobre Java");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo("Java. NET");
        cursoDotNet.setDescricao("Aprenda os conceitos básicos sobre C#");
        cursoDotNet.setCargaHoraria(8);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java Avançado");
        cursoJavaAvancado.setDescricao("Aprenda os conceitos avançados sobre Java");
        cursoJavaAvancado.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orietação a Objetos com Java");
        mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos");
        mentoria.setData(LocalDateTime.now().plusDays(1)); // 1 dia depois de hoje

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(LocalDate.now().plusDays(45));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev felipao = new Dev();
        felipao.setNome("Felipao");

        Dev anselmo = new Dev();
        anselmo.setNome("Anselmo");

        felipao.inscrever(cursoDotNet);
        felipao.inscrever(bootcamp);
        felipao.progredir();
        felipao.progredir();

        anselmo.inscrever(bootcamp);
        anselmo.progredir();
        anselmo.progredir();
        anselmo.progredir();

        //System.out.println(String.format("Felipao: %.2f", felipao.calcularTotalXp()));
       // System.out.println(String.format("Anselmo: %.2f", anselmo.calcularTotalXp()));

        List<Dev> ranking = Arrays.asList(felipao, anselmo).stream()
                .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
                .collect(Collectors.toList());
        for (Dev dev : ranking) {
            System.out.println(dev.getNome() + ": " + dev.calcularTotalXp());
        }

    }
}

