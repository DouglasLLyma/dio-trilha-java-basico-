import java.util.Iterator;
import java.util.TreeSet;

public class exerTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>  numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);
        
        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } 

        numeros.add(23);
        for(Integer novo: numeros){
            System.out.println("Adicionando números: " + novo);
        }

        numeros.add(13);
        System.out.println("Verifique o tamanho do set: "+ numeros.size());
        System.out.println("Verifique se a lista está vazia: " + numeros.isEmpty());
    }
}
