import java.io.*;
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
	public static void main(String[] args) 
	{
		new MainFrame();// TODO Auto-generated method stub
	}
	
	MainFrame()
	{
		myUser=new UserFrame();
		myLogin=new LoginFrame();
	}

}
