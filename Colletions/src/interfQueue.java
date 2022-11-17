import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class interfQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávia");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);
        String clienteASerAtendido = filaBanco.poll();//Usando o metodo poll veremos qual o primeiro item será excluido da lista//
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);
        String clienteASerAtendido2 = filaBanco.poll();
        System.out.println(clienteASerAtendido2);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();//Metodo peek retorno o primeiro elemento da fila ou se caso a fila esteja vazia ele retorna null.
        System.out.println(primeiroCliente);

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorfilaBanco = filaBanco.iterator();

        while (iteratorfilaBanco.hasNext()){
            System.out.println(iteratorfilaBanco.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        filaBanco.add("Amanda");
        filaBanco.add("Paulo");
        System.out.println(filaBanco.size());
        for (String cliente: filaBanco){
            System.out.println(cliente);
        }
    }
}
