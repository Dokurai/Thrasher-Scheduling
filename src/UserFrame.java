import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.*;



public class UserFrame extends JFrame 
{
	Hashtable<String,Vector> myHash;
	Container cp;
	JPanel [] panelArray;
	JLabel myLabel;
	JTable table;
	JTableHeader header;
	TableColumn column;
	Font myFont;
	MyTableModel myTableModel;
	JScrollPane myScrollPane;
	DefaultTableColumnModel colModel;
	
	UserFrame()
	{
		myHash=new Hashtable<String,Vector>();
		panelArray=new JPanel[8];
		panelArray[0]=new JPanel(new GridLayout(1,7));
		cp=getContentPane();
		for(int i=1;i<8;i++)
		{
			panelArray[i]=new JPanel();
			panelArray[0].add(panelArray[i]);
		}
		setDays();
		setupTable();
		cp.add(panelArray[0]);
		setupMainFrame();
	}
	void setupTable()
	{
		myTableModel = new MyTableModel();
		table = new JTable(myTableModel);
		myFont=new Font("Arial", Font.PLAIN, 16);
		table.setFont(myFont);
		table.setMinimumSize(new Dimension(10,10));
		myScrollPane=new JScrollPane(table);
		//================================================
		colModel=new DefaultTableColumnModel();
		column=new TableColumn(0);
		column.setPreferredWidth(10);
		column.setMinWidth(10);
		column.setHeaderValue("Name");
		colModel.addColumn(column);
		//=================================================
		column=new TableColumn(1);
		column.setPreferredWidth(10);
		column.setMinWidth(10);
		column.setHeaderValue("Position");
		colModel.addColumn(column);
		//=================================================
		column=new TableColumn(2);
		column.setPreferredWidth(10);
		column.setMinWidth(10);
		column.setHeaderValue("Days");
		colModel.addColumn(column);
		//=================================================
		table.setColumnModel(colModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		header=table.getTableHeader();
		table.setPreferredScrollableViewportSize(new Dimension(1000, 100));
        table.setFillsViewportHeight(true);
        panelArray[1].add(header);
        panelArray[1].add(myScrollPane);
	}
	
	void setDays()
	{
		myLabel=new JLabel("Monday");
		panelArray[1].add(myLabel);
		myLabel=new JLabel("Tuesday");
		panelArray[2].add(myLabel);
		myLabel=new JLabel("Wednesday");
		panelArray[3].add(myLabel);
		myLabel=new JLabel("Thursday");
		panelArray[4].add(myLabel);
		myLabel=new JLabel("Friday");
		panelArray[5].add(myLabel);
		myLabel=new JLabel("Saturday");
		panelArray[6].add(myLabel);
		myLabel=new JLabel("Sunday");
		panelArray[7].add(myLabel);
		
	}
	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/1, d.height/4);
		setLocation(d.width/500, d.height/3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ScheduleFrame");
		setVisible(true);
	}// end of setup
}
