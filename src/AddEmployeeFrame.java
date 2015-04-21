import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JComponent.*;
import javax.swing.JCheckBox.*;

import java.util.*;

public class AddEmployeeFrame extends JFrame implements ActionListener
{
	Container cp;
	JScrollPane sp;
	Vector<JCheckBox> checkBoxes;
	Vector<String> names;
	JButton nextButton;
	JButton cancelButton;
	JPanel buttonPanel;
	JPanel employeePanel;
	
	AddEmployeeFrame()
	{
		checkBoxes=new Vector<JCheckBox>();
		names=new Vector<String>();
		nextButton=new JButton("Next");
		cancelButton=new JButton("Cancel");
		cp=getContentPane();
		sp=new JScrollPane();
		employeePanel=new JPanel();
		sp.add(employeePanel);
		cp.add(sp,BorderLayout.CENTER);
		buttonPanel=new JPanel(new GridLayout(1,7));
		buttonPanel.add(new JLabel());
		buttonPanel.add(new JLabel());
		buttonPanel.add(new JLabel());
		buttonPanel.add(new JLabel());
		buttonPanel.add(new JLabel());
		buttonPanel.add(cancelButton);
		buttonPanel.add(nextButton);
		cp.add(buttonPanel,BorderLayout.SOUTH);
		setupMainFrame();
		
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	
	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/3, d.height/3);
		setLocation(d.width/3, d.height/3);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setTitle("Add Employee Frame");
		setVisible(true);
	}// end of setup
}
