import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class utilSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

        //Remova a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retorne a quantidad de itens da lista 
        System.out.println(notasAlunos.size());
        
        //Percorra todos os itens do Iterator 
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Double nota: notasAlunos){
            System.out.println(nota);
        }
        System.out.println("A lista está vazia: " + notasAlunos.isEmpty());
    }
}
