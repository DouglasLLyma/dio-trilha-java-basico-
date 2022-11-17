import java.util.Iterator;
import java.util.TreeSet;


public class exemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);

        //Retorne a Primeira capital no topo da árvore 
        System.out.println("Primeira capital no topo da árvore: " + treeCapitais.first());

        //Retorne a última capital no topo da árvore 
        System.out.println("Última capital no topo da árvore: " + treeCapitais.last());

        //Retorne a primeira capital abaixo na árvore da capital parametrizada 
        System.out.println("Capital parametrizada abaixo: " + treeCapitais.lower("Florianopolis"));

        //Retone a primeira capital acima da árvore da capital parametrizada
        System.out.println("Capital parametrizada acima: " + treeCapitais.higher("Florianopolis"));
        
        //Exiba todas as capitais 
        System.out.println(treeCapitais);

        //Retorne a primeira capital removendo no set
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);

        //Retorne a primeira capital no final da ávore removendo do set 
        System.out.println(treeCapitais.pollLast());
        System.out.println(treeCapitais);
        
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
                System.out.println("Usando Iterator: "  + iterator.next());
            }
        
        for (String capital: treeCapitais){
            System.out.println("Usando for: " + capital);
        }    
        
    }
}
