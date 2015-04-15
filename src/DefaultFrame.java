import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JComponent.*;
import javax.swing.JTable.*;
import javax.swing.table.*;


public class DefaultFrame extends JFrame implements ActionListener
{
	Container cp;
	JPanel mainPanel;
	DefaultTableColumnModel colModel;
	JTable table;
	JTableHeader header;
	TableColumn column;
	Font myFont;
	MyTableModel myTableModel;
	JScrollPane myScrollPane;
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new DefaultFrame();

	}

	DefaultFrame()
	{
		
		cp=getContentPane();
		//cp.add(mainPanel);
		myTableModel = new MyTableModel();
		table = new JTable(myTableModel);
		myFont=new Font("Arial", Font.PLAIN, 16);
		table.setFont(myFont);
		table.setMinimumSize(new Dimension(140,140));
		myScrollPane=new JScrollPane(table);
		//================================================
		colModel=new DefaultTableColumnModel();
		column=new TableColumn(0);
		column.setPreferredWidth(150);
		column.setMinWidth(100);
		column.setHeaderValue("Name");
		colModel.addColumn(column);
		//=================================================
		column=new TableColumn(1);
		column.setPreferredWidth(150);
		column.setMinWidth(100);
		column.setHeaderValue("Position");
		colModel.addColumn(column);
		//=================================================
		column=new TableColumn(2);
		column.setPreferredWidth(150);
		column.setMinWidth(100);
		column.setHeaderValue("Days");
		colModel.addColumn(column);
		//=================================================
		table.setColumnModel(colModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		header=table.getTableHeader();
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
		cp.add(header,BorderLayout.NORTH);
		cp.add(myScrollPane);
		
		setupMainFrame();
	}

	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;

		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/2, d.height/2);
		setLocation(d.width/4, d.height/4);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Scheduler");
		setVisible(true);
	}// end of setup
	public void actionPerformed(ActionEvent e)
	{

	}

}
