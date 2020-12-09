import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AplikasiJList extends JFrame {

    String[] warna = { "Biru", "Kuning", "Merah", "Hijau",
	 	       "Ungu", "Jingga", "Putih", "Hitam",
                       "Lainnya" };
    JList listWarna = new JList(warna);
       
    public AplikasiJList() {
        super("Aplikasi JList");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelJudul = new JLabel("Warna paling disukai: ");
                
        panel.add(labelJudul);
        
        // Atur jumlah data tertampil di JList
        listWarna.setVisibleRowCount(4);

        JScrollPane penggulung = new JScrollPane(listWarna);
        panel.add(penggulung);

        add(panel);
        
        listWarna.addListSelectionListener(
                       new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Dijalankan kalau ada pemilihan di list box
                JOptionPane.showMessageDialog(null, 
            	    "Pilihan Anda: " +
            	    listWarna.getSelectedValue().toString());
                
            }
        });
       
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiJList app = new AplikasiJList(); 
    }
}

