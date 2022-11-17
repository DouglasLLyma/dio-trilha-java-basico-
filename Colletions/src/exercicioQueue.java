import java.util.Queue;
import java.util.LinkedList;

public class exercicioQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes);
        System.out.println("Retorne o primeiro nome sem removelo: " + nomes.peek());
        System.out.println("Retorno o primeiro item da fila, removendo o mesmo: " + nomes.poll());
        System.out.println(nomes);
        System.out.println("Retorne o tamanho da lista: " + nomes.size());
        System.out.println("Verifique se a lista está vazia: " + nomes.isEmpty());
        boolean conteNome = nomes.contains("Carlos");
        System.out.println("Verifique se o nome Carlos está na lista: " + conteNome);
    }
}
