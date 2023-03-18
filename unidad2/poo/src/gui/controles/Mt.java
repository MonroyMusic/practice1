/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gonza
 */
public class Mt extends JFrame{
    
    public Mt(){
        
        super("Tablas de Multiplicar");
        
        setSize(750, 500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JTextField txtmult = new JTextField(5);
        add(txtmult);
        
        JTextField txtmultp = new JTextField(5);
        add(txtmultp);
        
        JButton btnaction = new JButton("Mostrar");
        add(btnaction);
        
        JTextArea txtarea = new JTextArea(20, 50);
        add(txtarea);
        
        btnaction.addActionListener(e -> {
        
            txtarea.setText("");
            
            if(txtmult.getText().length() == 0){
                
                String error1 = "El campo del Multiplicando esta vacio."
                        + "\nIngrese" + " un valor";
                
                txtarea.append(error1);
                
            }else{
                
                for (int i = 0; i < Integer.parseInt(txtmultp.getText()); i++) {
                                
                String msg = txtmult.getText() + " x " + (i+1) + " = " + 
                        (Integer.parseInt(txtmult.getText()) * (i+1)) + "\n"; 
                
                txtarea.append(msg);
                
                }
                
            }
            
            if(txtmultp.getText().length() == 0){
                
                String error1 = "El campo del Multiplicador esta vacio."
                        + "\nIngrese" + " un valor";
                
                txtarea.append(error1);
                
            }else {
                
                for (int i = 0; i < Integer.parseInt(txtmultp.getText()); i++) {
                                
                String msg = txtmult.getText() + " x " + (i+1) + " = " + 
                        (Integer.parseInt(txtmult.getText()) * (i+1)) + "\n"; 
                
                txtarea.append(msg);
                
                }
                
            }
            
            
            
        });
 
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Mt();
        
    }
    
}
