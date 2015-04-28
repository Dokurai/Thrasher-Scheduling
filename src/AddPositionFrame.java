import java.awt.*;

import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;

import java.util.Vector;

import javax.swing.*;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddPositionFrame extends JFrame implements ActionListener
{
	ButtonGroup myGroup;
	Vector<JRadioButton> myRadioButton;
	JPanel myPanel;
	JButton nextButton;
	JButton newButton;
	JButton cancelButton;
	JPanel buttonPanel;
	Container cp;
	
	AddPositionFrame()
	{
		myGroup=new ButtonGroup();
		myRadioButton=new Vector<JRadioButton>();
		myRadioButton.add(new JRadioButton("Supervisor"));
		myRadioButton.add(new JRadioButton("Project Manager"));
		myRadioButton.add(new JRadioButton("<Temp Job Name>"));
		
		nextButton=new JButton("Next");
		newButton=new JButton("New Job Title");
		cancelButton=new JButton("Cancel");
		
		buttonPanel=new JPanel(new GridLayout(1,7));
		buttonPanel.add(new JLabel(""));
		buttonPanel.add(new JLabel(""));
		buttonPanel.add(new JLabel(""));
		buttonPanel.add(new JLabel(""));
		buttonPanel.add(new JLabel(""));
		buttonPanel.add(cancelButton);
		buttonPanel.add(nextButton);
		
		cp=getContentPane();
		
		myGroup.add(myRadioButton.elementAt(0));
		myGroup.add(myRadioButton.elementAt(1));
		myGroup.add(myRadioButton.elementAt(2));
		myPanel=new JPanel(new GridLayout(2,2,15,15));
		
		myPanel.add(myRadioButton.elementAt(0));
		myPanel.add(myRadioButton.elementAt(1));
		myPanel.add(myRadioButton.elementAt(2));
		myPanel.add(newButton);
		cp.add(myPanel,BorderLayout.CENTER);
		cp.add(buttonPanel,BorderLayout.SOUTH);
		setupMainFrame();
	}
	
	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/3, d.height/8);
		setLocation(d.width/3, d.height/3);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		setTitle("Add Position Frame");
		setVisible(true);
	}// end of setup

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
