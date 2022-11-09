import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    public static void main(String[] argus) {
        System.out.println("--\tOrdem Aleatório\t---");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s Show", "Comédia", 25));
        }};
        System.out.println(minhasSeries);
        for (Serie serie:minhasSeries) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoDeEpisodio());
        System.out.println("---Ordem Natural (TempoDeEpisodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie:minhasSeries2) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoDeEpisodio());
        System.out.println("---\tOrdem Nome/Genero/TempoEpisodio\t");

}
    
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoDeEpisodio;


    public Serie(String nome, String genero, Integer tempoDeEpisodio){
    this.nome = nome;
    this.genero = genero;
    this.tempoDeEpisodio = tempoDeEpisodio;
    }

    public String getNome(){
        return nome;
    }
    public String getGenero(){
        return genero;
    }
    public Integer getTempoDeEpisodio(){
        return tempoDeEpisodio;
    }


    @Override
    public String toString(){
        return "{" +
            "nome='" + nome + '\'' +
            ", genero='" + genero + '\'' + 
            ", tempoDeEpisodio='" + tempoDeEpisodio + 
            '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoDeEpisodio.equals(serie.tempoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpisodio);
    }

    @Override
    public int compareTo(Serie serie){
        int tempoDeEpisodio =  Integer.compare(this.getTempoDeEpisodio(), serie.getTempoDeEpisodio());
        if(tempoDeEpisodio != 0) return tempoDeEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
        
    }

 
}