import javax.swing.*;
import java.awt.Dimension;

public class AplikasiJTable extends JFrame {
    public AplikasiJTable() {
        super("Aplikasi JTable");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        // Buat tabel
        String[][] infoNegara = { 
        	{"Austria", "Vienna", "Eropa" },
        	{"Belanda", "Amsterdam", "Eropa"},
        	{"China", "Beijing", "Asia"},
        	{"Denmark", "Copenhagen", "Eropa"},
        	{"India", "New Delhi", "Asia"},
        	{"Indonesia", "Jakarta", "Asia"},
        	{"Mesir", "Kairo", "Afrika"},
                {"Peru", "Lima", "Amerika Selatan"},
                {"Taiwan", "Taipeh", "Asia"}};
        			
        String[] judul = {"Negara", "Ibukota", "Benua"};
        
        JTable tabel = new JTable(infoNegara, judul);

        // Atur tinggi tabel
        int jumBaris = 6;
        int tinggi = 0; 
        for (int baris = 0; baris < jumBaris; baris++) 
            tinggi += tabel.getRowHeight(baris); 
     
        tabel.setPreferredScrollableViewportSize(new Dimension ( 
                tabel.getPreferredScrollableViewportSize().width, 
                tinggi)
        );
        
        // Letakkan tabel di JScrollPane
        JScrollPane panelTabel = new JScrollPane(tabel,
        		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
        		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        // Tambahkan panel untuk keterangan di bawah tabel
        JPanel panelKeterangan = new JPanel();
        JLabel info = new JLabel(
            "Anda bisa melakukan scrolling pada tabel di atas");
        panelKeterangan.add(info);
        
        // Letakan panel di frame
        add(panelTabel, "North");
        add(panelKeterangan, "South");
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiJTable app = new AplikasiJTable();
    }
}

