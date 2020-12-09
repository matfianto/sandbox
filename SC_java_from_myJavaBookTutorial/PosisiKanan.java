import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.*;

public class PosisiKanan extends JFrame {    
    public PosisiKanan() {
        super("Contoh Penangan Klik di Tombol");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan panel
        // Tambahkan komponen-komponen
        JPanel panelBarat = new JPanel();
        JPanel panelTimur = new JPanel();
        
        JLabel labelWaktu = new JLabel("Waktu sekarang: 00:00:00");
        JButton tombolProses = new JButton("Info Waktu");
        JButton tombolKeluar = new JButton("Keluar");
        
        panelBarat.add(labelWaktu);
        
        GridLayout grid = new GridLayout(2, 1); 
        panelTimur.setLayout(grid);

        panelTimur.add(tombolProses);
        panelTimur.add(tombolKeluar);
        
        add(panelBarat, BorderLayout.WEST);
        add(panelTimur, BorderLayout.EAST);
        
        // Tampilkan jendela
        setVisible(true);

        // Pasang pemantau klik
        tombolProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Dieksekusi kalau tombol Info Waktu diklik
                Calendar cal = Calendar.getInstance();

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
        PosisiKanan jendela = new PosisiKanan(); 
    }
}

