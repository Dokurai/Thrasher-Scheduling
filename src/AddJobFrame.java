import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AddJobFrame extends JFrame implements ActionListener
{
	Container cp;
	JComboBox<String> jobComboBox;
	JButton newButton;
	JButton cancelButton;
	JButton nextButton;
	JPanel mainPanel;
	JPanel buttonPanel;
	AddEmployeeFrame myEmployeeFrame;
	
	AddJobFrame()
	{
		jobComboBox=new JComboBox<String>();
		newButton=new JButton("New Job");
		newButton.setActionCommand("NEW");
		newButton.addActionListener(this);
		cancelButton=new JButton("Cancel");
		cancelButton.setActionCommand("CANCEL");
		cancelButton.addActionListener(this);
		nextButton=new JButton("Next");
		nextButton.setActionCommand("NEXT");
		nextButton.addActionListener(this);
		mainPanel=new JPanel();
		buttonPanel=new JPanel(new GridLayout(1,3,5,5));
		cp=getContentPane();
		setResizable(false);
		
		
		jobComboBox.addItem("                                                                                               ");
		jobComboBox.addItem("First Job");
		
		
		mainPanel.add(jobComboBox);
		buttonPanel.add(newButton);
		buttonPanel.add(cancelButton);
		buttonPanel.add(nextButton);
		cp.add(mainPanel);
		cp.add(buttonPanel,BorderLayout.SOUTH);
		
		setupMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("NEXT"))
			{
				if(jobComboBox.getSelectedIndex()==0)
					return;
				else
					myEmployeeFrame=new AddEmployeeFrame(jobComboBox.getSelectedItem().toString());
			}
		else if(e.getActionCommand().equals("CANCEL"))
			dispose();
		else
			{
				newJobName njn=new newJobName();
				
			}
		// TODO Auto-generated method stub
	}
	
	
	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/5, d.height/12);
		setLocation(d.width/500, d.height/3);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Add Job Frame");
		setVisible(true);
	}// end of setup

}
