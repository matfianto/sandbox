import javax.swing.*;

public class AplikasiTab extends JFrame {
    public AplikasiTab() {
        super("Aplikasi dengan JTabbedPane");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        // Buat 4 panel terlebih dulu
        JPanel panelSatu = new JPanel();
        JLabel labelSatu = new JLabel("<html>Michael Frank adalah " +
        	"penyanyi Jazz.<br>" +
        	"Lahir 18 September 1944 di La Jolla, California</html>");
        panelSatu.add(labelSatu);
        
        JPanel panelDua = new JPanel();
        JLabel labelDua = new JLabel("Album Foto:");
        panelDua.add(labelDua);

        JPanel panelTiga = new JPanel();
        JLabel labelTiga = new JLabel("<html>Album Lagunya antara lain:<br>" +
        	"Sleeping Gypsi,<br>Object of Desire, dan<br>" +
        	"Blue Pacific.</html>");
        panelTiga.add(labelTiga);

        // Buat JTabbedPane
        JTabbedPane panelTab = new JTabbedPane();
        panelTab.addTab("Data Pribadi", panelSatu);
        panelTab.addTab("Album Foto", panelDua);
        panelTab.addTab("Album Lagu", panelTiga);
        
        // Tambahkan TabbedPane ke frame
        add(panelTab);
                
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiTab app = new AplikasiTab();
    }
}

