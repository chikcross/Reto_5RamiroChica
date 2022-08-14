package codigo.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import codigo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz2 extends JFrame{
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scpanel01;

    public Interfaz2(){
        setTitle("Resultado de 'Consulta 2'");
        setSize(500,300);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);




        panelg=new JPanel();
        panelg.setBackground(new Color(51,122,255));

        String[] columnas={"ID","Constructora","Habitaciones","Ciudad"};
        ArrayList<String[]> datos_vo=Consulta2VO.valores();
        
        String[][] datos=new String[datos_vo.size()][4];
        for (int i=0; i<datos_vo.size(); i++) {
            int j=0;
            for (String s : datos_vo.get(i)) {
                //System.out.println(s);
                datos[i][j]=s;
                j++;
                
            }         
        }


        modelo=new DefaultTableModel(datos,columnas);
        tabla=new JTable(modelo);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,230);
        add(scpanel01);

        add(panelg);
        setVisible(true);



    }
    
}
