import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class newJobName extends JFrame implements ActionListener 
{
	Container cp;
	JButton okButton;
	JButton cancelButton;
	JLabel label;
	JTextField textField;
	JPanel mainPanel;
	JPanel buttonPanel;
	
	newJobName()
	{
		mainPanel=new JPanel();
		buttonPanel=new JPanel(new GridLayout(1,2,5,5));
		
		label=new JLabel("New Job Name");
		okButton=new JButton("OK");
		okButton.addActionListener(this);
		okButton.setActionCommand("OK");
		cancelButton=new JButton("Cancel");
		cancelButton.addActionListener(this);
		cancelButton.setActionCommand("CANCEL");
		textField=new JTextField(25);
		
		mainPanel.add(label);
		mainPanel.add(textField);
		buttonPanel.add(cancelButton);
		buttonPanel.add(okButton);
		cp=getContentPane();
		cp.add(mainPanel);
		cp.add(buttonPanel,BorderLayout.SOUTH);
		
		setupMainFrame();
	}
	
	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/6, d.height/9);
		setLocation(d.width/3, d.height/3);
	
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setTitle("New Job Frame");
		setVisible(true);
	}// end of setup
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
