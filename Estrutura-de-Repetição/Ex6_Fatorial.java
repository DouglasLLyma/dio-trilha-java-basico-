import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Ex6_Fatorial scan = new Ex6_Fatorial(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial+"! = ");
        for(int i = fatorial ; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
    
}