package codigo.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import codigo.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz1 extends JFrame {
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scpanel01;

    public Interfaz1(){
        setTitle("Resultado de 'Consulta 1'");
        setSize(500,350);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);




        panelg=new JPanel();
        panelg.setBackground(new Color(243,255,51));

        String[] columnas={"ID","Nombre","Apellido","Ciudad"};
        ArrayList<String[]> datos_vo=Consulta1VO.valores();
        
        String[][] datos=new String[datos_vo.size()][4];
        for (int i=0; i<datos_vo.size(); i++) {
            int j=0;
            for (String s : datos_vo.get(i)) {
                datos[i][j]=s;
                j++;
                
            }         
        }


        modelo=new DefaultTableModel(datos,columnas);
        tabla=new JTable(modelo);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,280);
        add(scpanel01);

        add(panelg);
        setVisible(true);



    }


    
}
