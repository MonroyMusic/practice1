/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gonza
 */

public class CheckBox extends JFrame{
    
    private JLabel lblmessage;
    
    public CheckBox(){
        
        super("Ejemplo de CheckBox");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JCheckBox ckJavascript = new JCheckBox("Javascript");
        add(ckJavascript);
        
        JCheckBox ckPhp = new JCheckBox("PHP");
        add(ckPhp);
        
        JCheckBox ckJava = new JCheckBox("Java");
        add(ckJava);
        
        JCheckBox ckVisualBasic = new JCheckBox("Visual Basic");
        add(ckVisualBasic);
        
        JCheckBox ckCsharp = new JCheckBox("C#");
        add(ckCsharp);
        
        JButton btnShow = new JButton("Ver Seleccionados");
        add(btnShow);
        
        lblmessage = new JLabel("Mensaje");
        add(lblmessage);
        
        btnShow.addActionListener(e ->{
        
            String msg = "Los Lenguajes de seleccionados son: ";
        
            if(ckCsharp.isSelected()){
                
                msg += "C#, ";
                
            } if(ckJava.isSelected()){
                
                msg += "Java, ";
                
            } if(ckJavascript.isSelected()){
                
                msg += "Javascipt, ";
                
            } if(ckPhp.isSelected()){
                
                msg += "PHP, ";
                
            } if(ckVisualBasic.isSelected()){
                
                msg += "Visual Basic, ";
                
            }
            
            lblmessage.setText(msg);
            
        });
        
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new CheckBox();
        
    }
    
}
