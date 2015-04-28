import java.lang.Object.*;
import java.awt.Component.*;
import java.awt.Container.*;
import javax.swing.JComponent.*;
import javax.swing.JTable.*;
import javax.swing.table.*;
import javax.swing.*;
import java.util.*;

public class MyTableModel extends AbstractTableModel implements TableModel
{
	JList nameList;
	JList daysList;
	JList positionList;
	DefaultListModel nameModel;
	DefaultListModel positionModel;
	DefaultListModel dayModel;
	MyTableModel()
	{
		nameModel=new DefaultListModel();
		positionModel=new DefaultListModel();
		dayModel=new DefaultListModel();
		nameList=new JList(nameModel);
		positionList=new JList(positionModel);
		daysList=new JList(dayModel);
	}
	@Override
	public int getRowCount()
	{
		return nameModel.getSize();
	}
	@Override
	public int getColumnCount()
	{
		return 3;
	}
	@Override
	public Object getValueAt(int row, int col)
	{
		System.out.println(nameModel.getElementAt(row));
		if(col==0)
			return nameModel.getElementAt(row);
		else
			return positionModel.getElementAt(row);
	}
	
}
