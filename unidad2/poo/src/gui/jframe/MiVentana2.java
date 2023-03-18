package gui.jframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana2 extends JFrame{
    
        public MiVentana2(){
            
        super("Eventos");
            
        setSize(300, 200);
            
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        JTextField txtnum1 = new JTextField(10);
        JTextField txtnum2 = new JTextField(10);
        add(txtnum1);
        add(txtnum2);
        
        JButton btnplus = new JButton("Sumar");
        add(btnplus);
        
        JLabel lblresult = new JLabel("Resultado: ");
        add(lblresult);
        
        btnplus.addActionListener(e -> {
        
            int n1 = Integer.parseInt(txtnum1.getText());
            int n2 = Integer.parseInt(txtnum2.getText());
            
            lblresult.setText("Resultado: " + (n1 + n2));
            
        });
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new MiVentana2();
        
    }
    
        
}
