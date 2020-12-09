import javax.swing.*;

public class AplikasiPenggulung extends JFrame {
    JTextArea textAreaDeskripsi;
    
    public AplikasiPenggulung() {
        super("JScrollPane");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelDeskripsi = new JLabel("Deskripsi:");
  
        textAreaDeskripsi = new JTextArea(4, 40);
        JScrollPane penggulung = new JScrollPane(textAreaDeskripsi, 
        		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
        		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel.add(labelDeskripsi);
        panel.add(penggulung);
        add(panel);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiPenggulung app = new AplikasiPenggulung(); 
    }
}

