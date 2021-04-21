/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import MainFrame.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Amy Leiva
 */
/*public class controlador implements ActionListener{
private MainFrame view;
private modelo modelss;
DefaultTableModel modelo;

       


    public controlador(MainFrame view,modelo modelss) {
        this.view = view;
       this.modelss=modelss;
       
         this.view.txtagregar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       modelss.setId(Integer.parseInt(view.txtid.getText()));
    modelss.setNombre(view.txtid.getText());
    modelss.setPrecio(Double.parseDouble(view.txtid.getText()));
  
    if(e.getSource()==view.txtagregar){
    llenartabla();
    
    }
    }
 public void llenartabla(){
      modelo=new DefaultTableModel();
     modelo.addColumn("ID");
     modelo.addColumn("Name");
     modelo.addColumn("Price");
         view.table.setModel(modelo);
   Object info[]=new Object[3];
 
        info[0]=modelss.getId();
        info[1]=modelss.getNombre();
        info[2]=modelss.getPrecio();
             modelo.addRow(info);  
   
   
   }
   


    
  
    

}*/