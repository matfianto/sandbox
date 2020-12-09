import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AplikasiTooltip extends JFrame {    
    public AplikasiTooltip() {
        super("Contoh ToolTip di Tombol");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan panel
        // Tambahkan komponen-komponen
        JPanel panel = new JPanel();
        JLabel labelWaktu = new JLabel("Waktu sekarang: 00:00:00");
        JButton tombolProses = new JButton("Info Waktu");
        JButton tombolKeluar = new JButton("Keluar");
        
        panel.add(labelWaktu);
        panel.add(tombolProses);
        panel.add(tombolKeluar);
        add(panel);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Atur tooltip
        tombolProses.setToolTipText("Menampilkan jam sekarang");
        tombolKeluar.setToolTipText("Mengakhiri aplikasi ini");

        // Pasang pemantau klik
        tombolProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Dieksekusi kalau tombol Info Waktu diklik
                Calendar cal = Calendar.getInstance();
    	        cal.getTime();
    	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	        
                labelWaktu.setText("Waktu sekarang: " + 
                	           sdf.format(cal.getTime()));
            }
        });
        
        tombolKeluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Dieksekusi kalau tombol Keluar diklik
                System.exit(0);
            }
        });        
    }
    
    public static void main(String[] args) {
        AplikasiTooltip jendela = new AplikasiTooltip(); 
    }
}

