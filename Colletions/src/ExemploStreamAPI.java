import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = 
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(s -> System.out.println(s));
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um set: ");
        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

        System.out.println("Transfome esta lista de String em uma lista de números inteiros: ");
         numerosAleatorios.stream()
            .map(s -> Integer.parseInt(s))
            .collect(Collectors.toList())
            .forEach(System.out::println);
        System.out.println("Pegue os números pares e maiores que 2 e coloque numa lista: ");       
                    
        
    }
}
