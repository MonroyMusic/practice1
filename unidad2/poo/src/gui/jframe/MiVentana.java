package gui.jframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MiVentana extends JFrame{

    public MiVentana(){
        
        super("My Windows");   
        
        setSize(300, 200);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        JTextField txtname = new JTextField(20);
        
        add(txtname);
        
        JButton button = new JButton("Click Here");
        
        add(button);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new MiVentana();
        
    }
    
}
