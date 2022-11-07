import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;





public class Screen extends JFrame{
    
    public Screen(){
        JFrame jframe = new JFrame();
        setVisible(true);
        setSize(1366, 768);
        setTitle("Ola Mundo!");
        setDefaultCloseOperation(jframe.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

        
        JButton jButton = new JButton();
        jButton.setBounds(400, 300, 250, 70);
        jButton.setText("Clique Aqui");
        jButton.setFont(new Font("Arial", Font.BOLD, 40));

        add(jButton);
        
        
    }
}
