import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AplikasiJRadio extends JFrame
                         implements ActionListener {
    JRadioButton radioHitam = new JRadioButton("Hitam", false);
    JRadioButton radioPutih = new JRadioButton("Putih", true);
    JRadioButton radioKuning = new JRadioButton("Kuning", false);
    
    JPanel panel = new JPanel();
	
    public  AplikasiJRadio() {
        super("Aplikasi JRadioButton");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        ButtonGroup grupTombol = new ButtonGroup();
        grupTombol.add(radioHitam);
        grupTombol.add(radioPutih);
        grupTombol.add(radioKuning);
              
        panel.add(radioHitam);
        panel.add(radioPutih);
        panel.add(radioKuning);
        add(panel);
        
        panel.setBackground(Color.WHITE);
        
        // Pasang pemantau kejadian klik
        radioHitam.addActionListener(this);
        radioPutih.addActionListener(this);
        radioKuning.addActionListener(this);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Dieksekusi kalau tombol diklik
    	  String perintah = e.getActionCommand();
    	  if (perintah.equals("Hitam")) 
    		panel.setBackground(Color.BLACK);
    	  else
    		if (perintah.equals("Putih"))
    	  	    panel.setBackground(Color.WHITE);
    	        else
    	            if (perintah.equals("Kuning"))
    	  	        panel.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
    	  AplikasiJRadio app = new  AplikasiJRadio(); 
    }
}

