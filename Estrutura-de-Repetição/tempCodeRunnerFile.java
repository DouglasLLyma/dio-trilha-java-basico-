import java.util.*;

public class numeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primieroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();

        if(primieroNumero == segundoNumero){
            System.out.println("São Iguais");
        }else{
            System.out.println("Não São Iguais.");
        }

        scanner.close();
    }
}