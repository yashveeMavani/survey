import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
public class MyFrame extends JFrame
{
	JLabel l1;
	Button b1;
	MyActionListener mf = new MyActionListener(this);
	MyFrame()
	{
		super("java project");
		setLayout(null);
		setBounds(0,0,800,800);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\bhakt\\Downloads\\BB.jpg")));
		l1 = new JLabel("Survey Managment System");
		b1 = new Button("Next");
		
		add(l1);
		add(b1);
		
		l1.setForeground(Color.black);
		b1.setForeground(Color.black);
		l1.setBounds(200,100,500,50);
		b1.setBounds(300,300,150,50);
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		b1.setFont(f1);
		b1.addActionListener(mf);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
	}
}