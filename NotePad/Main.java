//-------- Libraries -------//
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //-------- Named window ----------//
        JFrame win = new JFrame("NotePad");

        //--------------- Close X Button -----------------//
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon Icon = new ImageIcon(Main.class.getResource("Logo/Icon.png"));
        win.setIconImage(Icon.getImage());
        
        //----------------- Background ----------------//
        win.getContentPane().setBackground(Color.WHITE);
        
        //---------- Position ---------//
        win.setLocationRelativeTo(null);
        
        //--- Visibility ---//
        win.setVisible(true);
    }
}
