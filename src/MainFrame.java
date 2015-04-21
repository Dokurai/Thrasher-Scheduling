import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JComponent.*;
import javax.swing.JTable.*;
import javax.swing.table.*;



public class MainFrame 

{

	LoginFrame myLogin;
	UserFrame myUser;
	AddEmployeeFrame myEmployeeFrame;
	AddPositionFrame myPositionFrame;
	public static void main(String[] args) 
	{
		new MainFrame();// TODO Auto-generated method stub
	}
	
	MainFrame()
	{
		myUser=new UserFrame();
		myLogin=new LoginFrame();
		myEmployeeFrame=new AddEmployeeFrame();
		myPositionFrame=new AddPositionFrame();
	}

}
