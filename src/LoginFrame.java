import javax.swing.*;

import java.awt.*;


public class LoginFrame extends JFrame 
{
	JLabel nameLabel;
	JLabel passwordLabel;
	JTextField nameField;
	JTextField passwordField;
	JButton closeButton;
	JButton okButton;
	Container cp;
	JPanel bottomPanel;
	JPanel fieldPanel;
	LoginFrame()
	{
		nameLabel=new JLabel("Name: ");
		passwordLabel=new JLabel("Password: ");
		nameField=new JTextField(15);
		passwordField=new JTextField(15);
		closeButton=new JButton("CLOSE");
		okButton=new JButton("OK");
		fieldPanel=new JPanel(new GridLayout(3,2));
		fieldPanel.add(nameLabel);
		fieldPanel.add(nameField);
		fieldPanel.add(passwordLabel);
		fieldPanel.add(passwordField);
		fieldPanel.add(closeButton);
		fieldPanel.add(okButton);
		bottomPanel=new JPanel();
		bottomPanel.add(fieldPanel);
		cp=getContentPane();
		cp.add(bottomPanel);
		setupMainFrame();
	}
	void setupMainFrame()
	{
		Toolkit tk;
		Dimension d;
	
		tk = Toolkit.getDefaultToolkit();
		d = tk.getScreenSize();
		setSize(d.width/4, d.height/8);
		setLocation(d.width/3, d.height/3);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setTitle("Login Frame");
		setVisible(true);
	}// end of setup
}