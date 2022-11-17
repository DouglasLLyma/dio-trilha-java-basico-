import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista02 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(2,"Roberto");
        System.out.println("Substitua o nome Carlos por Roberto: ");
        System.out.println(nomes);
        String nome = nomes.get(1);
        System.out.println("Exiba o nome na posição 1: " + nome);
        nomes.remove(4);
        System.out.println("Exiba o nome na posição 4: " + nomes);
        nomes.remove("João");
        System.out.println("Remova o nome João da Lista: "+ nomes);
        int tamanho = nomes.size();
        System.out.println("Retorno a quantidade de itens na lista: " + tamanho);
    
        boolean verificaNome = nomes.contains("Juliano");
        System.out.println("Juliano esta na Lista: "+ verificaNome);

        List<String> nomes1 = new ArrayList();
        nomes1.add("Ismael");
        nomes1.add("Rodrigo");
        System.out.println(nomes1);
        nomes.addAll(tamanho, nomes1);//Contatenar duas listas//
        Collections.sort(nomes);
        System.out.println(nomes);      
        boolean listaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia: " + listaVazia);
    }
}
