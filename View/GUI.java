
package View;

import Controller.ButtonHandler;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUI {
    public JFrame frame;
    public JPanel panel1;
    public JPanel panel2;
    public JTable table1;
    public JTable table2;
    public DefaultTableModel model1;
    public DefaultTableModel model2;
    public JButton button1;
    public JButton button2;
    ButtonHandler hnd;
    
    public GUI()
    {
        initGUI();
    }
    public void initGUI()
    {
        frame= new JFrame("Shopping Cart");
        frame.setLayout(null);
        
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setSize(200, 300);
        panel1.setLocation(20, 20);
        
        String y[]={"Items"}; 
        String x[][] = {{"Books"},{"Movies"},{"Clothes"},{"Coffee"}};
        model1= new DefaultTableModel(x,y);
        table1=new JTable(model1);  
        table1.setRowHeight(25);
        JScrollPane tableContainer1 = new JScrollPane(table1);
        panel1.add(tableContainer1, BorderLayout.CENTER);
        frame.add(panel1);
           
  
        button1 = new JButton(">>");
        button1.setBounds(240, 100, 60, 30);
        
        
        hnd = new ButtonHandler(this);
        button1.addActionListener(hnd);
        frame.add(button1);
        
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.setSize(200, 300);
        panel2.setLocation(320, 20);
        
        String y1[]={"Items"}; 
        model2= new DefaultTableModel(y,0);
        table2=new JTable(model2);  
        table2.setRowHeight(25);
        JScrollPane tableContainer = new JScrollPane(table2);
        panel2.add(tableContainer, BorderLayout.CENTER);
        frame.add(panel2);
        
        button2 = new JButton("<<");
        button2.setBounds(240, 200, 60, 30);
        button2.addActionListener(hnd);
        frame.add(button2);
        
        
        
        
        frame.setSize(570, 500);
        frame.setLocation(350, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
