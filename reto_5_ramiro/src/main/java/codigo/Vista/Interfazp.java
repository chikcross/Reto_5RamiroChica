package codigo.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Interfazp extends JFrame implements ActionListener{
    JButton btn01;
    JButton btn02;
    JButton btn03;
    JButton btn04;
    //JPanel panel01;

    JPanel panelg;  

    public Interfazp() {
        setTitle("Ventana Principal 'Base de Datos Ministerio de Vivienda'");
        setResizable(false);
        setSize(500,500);

        panelg=new JPanel();
        panelg.setBackground(new Color(0,255,228));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn01 = new JButton("Lider del Proyecto");
        btn01.setBounds(20,80,150,30);
        btn01.addActionListener(this);
        add(btn01);

        btn02 = new JButton("Constructoras del Proyecto");
        btn02.setBounds(150,210,200,30);
        btn02.addActionListener(this);
        add(btn02);

        btn03 = new JButton("Bancos Vinculados");
        btn03.setBounds(250,360,200,30);
        btn03.addActionListener(this);
        add(btn03);

        btn04 = new JButton("Ramiro Chica");
        btn04.setBounds(0,430,200,30);
        btn04.addActionListener(this);
        add(btn04);


        


        //panel01=new JPanel();
        //add(panel01);
        add(panelg);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==btn01){
            new Interfaz1();         
        }
        if (e.getSource()==btn02){
            new Interfaz2();         
        }
        if (e.getSource()==btn03){
            new Interfaz3();         
        }

        
    }    


    
}
