import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Date;
import java.util.Locale;


public class HoraDoSitema {
    public static void main(String[] args) {
        Date relogio = new  Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        Locale ling = Locale.getDefault();
        System.out.println("Seu Sistema está em " + ling.getDisplayLanguage()+"!");
        Toolkit.getDefaultToolkit();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem a resolução de: "+lar+ " x "+alt+"!");
    }
}
