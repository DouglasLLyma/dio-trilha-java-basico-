import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exercicioHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.0);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

        //Remova a nota do Set 
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);
        //Retorno a quantidade de itens do Set
        System.out.println(notasAlunos.size());
        //Navegue em todos os itens do Iterator 
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()) {
            
            System.out.println("Utilizando while: " + iterator.next());
        }
        
        for (Double nota: notasAlunos) {
            System.out.println("Utilizando for: " + nota);
        }

        //Apague todos itens da lista 
        notasAlunos.clear();
        System.out.println(notasAlunos);

        //Confira se a lista está vazia 
        System.out.println("A lista está vazia: " + notasAlunos.isEmpty());
    }
}
