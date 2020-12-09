import javax.swing.*;
import java.awt.event.*;

public class AplikasiJMenu extends JFrame
                           implements ActionListener
{
    public AplikasiJMenu() {
        super("Aplikasi JMenu");
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

        // Pasang pemantau tombol
        pilihanFile1.addActionListener(this);
        pilihanFile2.addActionListener(this);
        pilihanFile2.addActionListener(this);
        pilihanBantuan1.addActionListener(this);
        pilihanBantuan2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Dieksekusi kalau tombol diklik
    	String perintah = e.getActionCommand();
    	if (perintah.equals("Baru")) 
    	    JOptionPane.showMessageDialog(null, 
                "Anda mengeklik pilihan Baru");
    	else if (perintah.equals("Simpan"))
            JOptionPane.showMessageDialog(null, 
                "Anda mengeklik pilihan Simpan");
    	else if (perintah.equals("Cetak"))
    	    JOptionPane.showMessageDialog(null, 
                "Anda mengeklik pilihan Cetak");
        else if (perintah.equals("Selamat Datang"))
    	    JOptionPane.showMessageDialog(null, 
                "Anda mengeklik pilihan Selamat Datang");
        else if (perintah.equals("Tentang Program"))
    	    JOptionPane.showMessageDialog(null, 
                "Anda mengeklik pilihan Tentang Program");    
    }

    public static void main(String[] args) {
    	AplikasiJMenu app = new AplikasiJMenu();
    }
}

