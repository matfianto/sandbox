import javax.swing.*;

public class AplikasiJTextArea extends JFrame {
    JTextArea textAreaDeskripsi;
	
    public AplikasiJTextArea() {
        super("Contoh JTextArea");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelDeskripsi = new JLabel("Deskripsi:");
  
        textAreaDeskripsi = new JTextArea(4, 40);
        
        panel.add(labelDeskripsi);
        panel.add(textAreaDeskripsi);
        add(panel);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiJTextArea jendela = new AplikasiJTextArea(); 
    }
}

