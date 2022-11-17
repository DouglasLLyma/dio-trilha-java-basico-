import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList01{
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);
        System.out.println("Substitua um nome na posição 2 da lista: ");
        nomes.set(2, "Larissa");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("Substitua usando set o nome na posição 2 por Wesley: ");   
        nomes.set(2, "Wesley");
        System.out.println(nomes);
        System.out.println("Remova o nome na posição 4: ");    
        nomes.remove(4);
        System.out.println(nomes);
        System.out.println("Remova no nome Wesley da lista: ");
        nomes.remove("Wesley");
        System.out.println(nomes);
        String nome = nomes.get(1);
        System.out.println("Exiba o elemento na posição 1: " + nome);
        int tamanho = nomes.size();
        System.out.println("Exiba o tamanho da lista: " + tamanho );
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Anderson está na lista: " + temAnderson);
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Lista está vazia: " + listaVazia);
        int posicao = nomes.indexOf("Carlos");
        System.out.println("Qual a posição de Carlos na lista: " + posicao);
        nomes.remove("Larissa");
        for (String nomeDoItem: nomes){
            System.out.println("--->"+ nomeDoItem);
        }
    }
}