import javax.swing.*;

public class ContohGUI extends JFrame {    
    public ContohGUI() {
        super("GUI dengan JFrame");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ContohGUI jendela = new ContohGUI(); 
    }
}

