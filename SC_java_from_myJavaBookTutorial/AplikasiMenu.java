import javax.swing.*;

public class ContohMenu extends JFrame {
    public ContohMenu() {
        super("Menu");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Buat menu File dan isinya
        JMenu menuFile = new JMenu("File");
        JMenuItem pilihanFile1 = new JMenuItem("Baru");
        JMenuItem pilihanFile2 = new JMenuItem("Simpan");
        JMenuItem pilihanFile3 = new JMenuItem("Keluar");
        menuFile.add(pilihanFile1);
        menuFile.add(pilihanFile2);
        menuFile.addSeparator();
        menuFile.add(pilihanFile3);
        
        // Buat menu Bantuan dan isinya
        JMenu menuBantuan = new JMenu("Bantuan");
        JMenuItem pilihanBantuan1 = new JMenuItem("Selamat Datang");
        JMenuItem pilihanBantuan2 = new JMenuItem("Tentang Program");

        menuBantuan.add(pilihanBantuan1);
        menuBantuan.addSeparator();
        menuBantuan.add(pilihanBantuan2);
        
        // Buat menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuFile);
        menuBar.add(menuBantuan);
        
        
        // Buat panel
        JPanel panel = new JPanel();
        
        // Tambahkan menuBar dan panel ke frame
        add(menuBar, "North");
        add(panel, "South");
                
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	new ContohMenu();
    }
}

