import java.util.HashMap;
import java.util.Map;

public class exemploHasMap {
    public static void main(String[] args) {
        Map<String, Integer> campeosMundiaisFifa = new HashMap<>();
        campeosMundiaisFifa.put("Brasil", 5);
        campeosMundiaisFifa.put("Alemanha", 4);
        campeosMundiaisFifa.put("Itália", 4);
        campeosMundiaisFifa.put("Uruguai", 2);
        campeosMundiaisFifa.put("Argentina", 2);
        campeosMundiaisFifa.put("França", 2);
        campeosMundiaisFifa.put("Inglaterra", 1);
        campeosMundiaisFifa.put("Espanha", 1);
        System.out.println(campeosMundiaisFifa);
        campeosMundiaisFifa.put("Brasil", 6);
        System.out.println("Atualizado: " + campeosMundiaisFifa);

        //Retone a Argentina 
        System.out.println("Retorne quantos titulos tem a Argentina: " + campeosMundiaisFifa.get("Argentina"));
        //Confira se existe França
        System.out.println("França está na lista: " + campeosMundiaisFifa.containsKey("França"));
        campeosMundiaisFifa.remove("França");
        System.out.println("A França está na lista: " + campeosMundiaisFifa.containsKey("França"));
        System.out.println("Alguma seleção com 6 títulos: " + campeosMundiaisFifa.containsValue(6));
        System.out.println("Qual o tamanho da lista: " + campeosMundiaisFifa.size());
        for (Map.Entry<String, Integer> Entry: campeosMundiaisFifa.entrySet()) {
            System.out.println(Entry.getKey() + " -- " + Entry.getValue());
        }

        for (String Key: campeosMundiaisFifa.keySet()){
            System.out.println(Key + " -- " + campeosMundiaisFifa.get(Key));
        }

        System.out.println("Estados Unidados Está na lista: " + campeosMundiaisFifa.containsKey("Estados Unidos"));
        System.out.println("Qual o tamanho da lista: " + campeosMundiaisFifa.size());
        campeosMundiaisFifa.clear();
        System.out.println("A lista está vazia: " + campeosMundiaisFifa.isEmpty());
        System.out.println(campeosMundiaisFifa.size());
    }
}
