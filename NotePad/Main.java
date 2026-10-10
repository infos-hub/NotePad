//-------- Libraries -------//
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //-------- Named window ---------//
        JFrame win = new JFrame("Player");

        //----------------- Background ----------------//
        win.getContentPane().setBackground(Color.WHITE);
        
        //---------- Position ---------//
        win.setLocationRelativeTo(null);
        
        //--- Visibility ---//
        win.setVisible(true);
    }
}