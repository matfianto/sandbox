import javax.swing.*;
import java.awt.*;

public class AplikasiJPasswordField extends JFrame {
    public AplikasiJPasswordField() {
        super("Contoh Pasword");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelPemakai = new JLabel("Pemakai:");
        JTextField fieldPemakai = new JTextField(10);

        JLabel labelPassword = new JLabel("Password:");
        JPasswordField password = new JPasswordField(10);

        GridLayout grid = new GridLayout(2, 2, 0, 10); 
        panel.setLayout(grid);
        
        panel.add(labelPemakai);
        panel.add(fieldPemakai);
        panel.add(labelPassword);
        panel.add(password);
        
        add(panel, BorderLayout.NORTH);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	AplikasiJPasswordField app = new 
    	                             AplikasiJPasswordField(); 
    }
}

