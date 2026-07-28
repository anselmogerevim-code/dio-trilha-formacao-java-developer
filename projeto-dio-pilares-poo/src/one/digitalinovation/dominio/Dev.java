package one.digitalinovation.dominio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public void inscrever(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            System.err.println("Você já inscreveu nesse conteúdo.");
        } else {
        conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp) {
        // Alternativa 1: foreach tradicional
        for (Conteudo conteudo : bootcamp.getConteudos()) {
        inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);
        // Alternativa 2: API Stream.
       //  bootcamp.getConteudos().forEach(this::inscrever); // Faz o mesmo que acima

    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está mais inscrito em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream() // mapeia o conteudosConcluidos para o xp
                .mapToDouble(conteudo -> conteudo.calcularXp()) // mapeia o conteudo para o xp
                .sum(); // soma os xps


    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    }


