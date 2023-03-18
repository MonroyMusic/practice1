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
public class Array extends JFrame{
    
    String msg;
    int[] array;
    int flag = 0;
    
    public Array(){
        
        super("Arreglos"); 
        
        setSize(750, 500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JTextField txtcant = new JTextField(15);
        add(txtcant);
        
        JButton btncant = new JButton("Crear");
        add(btncant);
        
        JTextField txtadd = new JTextField(15);
        add(txtadd);
        
        JButton btnadd = new JButton("Add");
        add(btnadd);
                     
        JButton btnshow = new JButton("Listar");
        add(btnshow);
            
        JTextArea txtlist = new JTextArea(20, 30);
        add(txtlist);
        
        txtcant.setText("0");
        txtadd.setText("0");
        
        btncant.addActionListener(e -> {
        
            array = new int[Integer.parseInt(txtcant.getText())]; 
            
        });

        btnadd.addActionListener(e -> {
        
            array[flag] = Integer.parseInt(txtadd.getText());
            
            flag++;
            
            if(flag >= Integer.parseInt(txtcant.getText())){
                
                msg = "Se ingresaron la cantidad suficiente de datos para llenar"
                        + "el arreglo";
                
                txtlist.append(msg);
                
            }
            
        });
        
        btnshow.addActionListener(e -> {
            
            txtlist.setText("");
            
            
            for (int i = 0; i < Integer.parseInt(txtcant.getText()); i++) {
                    
                msg = (i+1) + ") " + array[i] + "\n";
                    
                txtlist.append(msg);
                    
            }
            
        });
            
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Array();
        
    }
    
}
