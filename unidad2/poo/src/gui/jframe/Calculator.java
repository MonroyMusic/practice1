package gui.jframe;

import java.awt.FlowLayout;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
    
    public Calculator(){
        
        super("CALCULADORA");
        
        DecimalFormat formato = new DecimalFormat("#.00");
       
        setSize(500, 400);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JTextField txtnum1 = new JTextField(20);
        JTextField txtnum2 = new JTextField(20);
        
        add(txtnum1);
        add(txtnum2);
        
        JButton btnplus = new JButton("SUMAR");
        JButton btnless = new JButton("RESTA");
        JButton btndot = new JButton("MULTIPLICACION");
        JButton btnenter = new JButton("DIVISION");
       
        add(btnplus);
        add(btnless);
        add(btndot);
        add(btnenter);
        
        JLabel lblresutl = new JLabel("Resultado: ");
        
        add(lblresutl);
        
        btnplus.addActionListener(e -> {
        
            int n1 = Integer.parseInt(txtnum1.getText());
            int n2 = Integer.parseInt(txtnum2.getText());
            
            lblresutl.setText("Resultado: " + (n1 + n2));
            
        });
        
        btnless.addActionListener(e -> {
        
            int n1 = Integer.parseInt(txtnum1.getText());
            int n2 = Integer.parseInt(txtnum2.getText());
            
            lblresutl.setText("Resultado: " + (n1 - n2));
            
        });
        
        btndot.addActionListener(e -> {
        
            int n1 = Integer.parseInt(txtnum1.getText());
            int n2 = Integer.parseInt(txtnum2.getText());
            
            lblresutl.setText("Resultado: " + (n1 * n2));
            
        });
        
        btnenter.addActionListener(e -> {
        
            double n1 = Integer.parseInt(txtnum1.getText());
            double n2 = Integer.parseInt(txtnum2.getText());
            
            lblresutl.setText("Resultado: " + formato.format((n1/n2)));
            
        });
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Calculator();
        
    }
    
}
