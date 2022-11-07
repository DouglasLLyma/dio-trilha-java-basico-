import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;




public class SetExemplo {
public static void main(String[] args) {
    
    System.out.println("Crie um conjunto e adicione as notas: ");
    List <Double> notas = new ArrayList<Double>();
    
    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6);
    
    System.out.println(notas.toString());
    System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));
    System.out.println("Exiba a menor nota: " + Collections.min(notas));
    System.out.println("Exiba a maior nota: " + Collections.max(notas));
    System.out.println("Exiba a soma dos valores: ");
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()){
        Double next = iterator.next();
        soma += next;
    }
    System.out.println(soma);
    System.out.println("Exiba a média das notas: "+ (soma/notas.size()));
    System.out.println("Remova a nota 0: ");
    notas.remove(0.0);
    System.out.println(notas);
    System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
    System.out.println("Apague o conjulto: ");
    notas.clear();
    System.out.println(notas);

     
}
}
