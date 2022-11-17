import java.util.Iterator;
import java.util.LinkedHashSet;

public class exercicioLinkdHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        System.out.println(sequenciaNumerica);

        //Remova o numero do Set 
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retorno a quantidade dos itens 
        System.out.println("Quantidade da lista: " + sequenciaNumerica.size());

        //Navegue por todos os itens da lista 
        Iterator<Integer> douglas = sequenciaNumerica.iterator();
        while (douglas.hasNext()){
            System.out.println("while = " + douglas.next());
        }

        for (Integer novo: sequenciaNumerica){
            System.out.println("For = " + novo);
        }

        System.out.println("Verifique se a lista está vazia: " + sequenciaNumerica.isEmpty());

        //Apague todos os elementos da lista 
        sequenciaNumerica.clear();

        System.out.println("Verifique se a lista está vazia: " + sequenciaNumerica.isEmpty());
    }
}
