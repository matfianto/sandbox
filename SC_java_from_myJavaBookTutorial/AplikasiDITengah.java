import javax.swing.*;

public class AplikasiDiTengah extends JFrame {    
    public AplikasiDiTengah() {
        super("GUI dengan JFrame");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // Letakkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        AplikasiDiTengah jendela = new AplikasiDiTengah(); 
    }
}

