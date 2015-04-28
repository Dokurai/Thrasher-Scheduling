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
	
	AddEmployeeFrame(String jobName)
	{
		checkBoxes=new Vector<JCheckBox>();
		checkBoxes.add(new JCheckBox("John Doe"));
		checkBoxes.add(new JCheckBox("Jane Doe"));
		checkBoxes.add(new JCheckBox("Harold Ramis"));
		checkBoxes.add(new JCheckBox("Egon Spangler"));
		
		names=new Vector<String>();
		nextButton=new JButton("Next");
		cancelButton=new JButton("Cancel");
		
		cp=getContentPane();
		
		employeePanel=new JPanel();
		sp=new JScrollPane(employeePanel);
		for(int i=0;i<checkBoxes.size();i++)
		{
			employeePanel.add(checkBoxes.get(i));
		}
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
		
		setupMainFrame(jobName);
		
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	
	void setupMainFrame(String frameName)
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/3, d.height/3);
		setLocation(d.width/3, d.height/3);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		setTitle(frameName+"-Add Employee Frame");
		setVisible(true);
	}// end of setup
}
