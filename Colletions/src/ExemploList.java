import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.00: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 7.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5d está na lista: "+ notas.contains(5d));
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
            
        }
        System.out.println("Exiba a soma dos valores: "+ soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        notas.remove(0d);
        System.out.println("Remona a nota 0.0: " + notas);
        notas.add(0d);
        notas.remove(0);
        System.out.println("Remova a nota na posição 0: " + notas);
        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Apague toda a Lista!");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se a lista está vazia: "+ notas.isEmpty());

    }
}
