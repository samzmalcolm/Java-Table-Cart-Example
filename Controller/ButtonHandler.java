
package Controller;

import View.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener{

    GUI g;
    public ButtonHandler(GUI gg)
    {
        g = gg;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
      if(e.getActionCommand().equalsIgnoreCase(">>"))
      {
         int selectedRow = g.table1.getSelectedRow();
         selectedRow = g.table1.convertRowIndexToModel(selectedRow);
         if(selectedRow >= 0)
         {
              String item = (String)g.table1.getModel().getValueAt(selectedRow, 0);
              String [] data = new String [1];
              data[0]=item;
              g.model2.addRow(data);
              g.model1.removeRow(selectedRow);
         }
          
      }
      
      if(e.getActionCommand().equalsIgnoreCase("<<"))
      {
         int selectedRow = g.table2.getSelectedRow();
         selectedRow = g.table2.convertRowIndexToModel(selectedRow);
         if(selectedRow >= 0)
         {
              String item = (String)g.table2.getModel().getValueAt(selectedRow, 0);
              String [] data = new String [1];
              data[0]=item;
              g.model1.addRow(data);
              g.model2.removeRow(selectedRow);
                   
         }
                
          
      }
      
      
      
    }
    
}
