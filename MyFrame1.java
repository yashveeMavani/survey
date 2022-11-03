import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame1 extends JFrame
{
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8;
	MyActionListener mf1 = new MyActionListener(this);
	MyFrame1()
	{
		super("java project");
		setLayout(null);
		setBounds(0,0,1000,1000);
		setContentPane(new JLabel(new ImageIcon()));
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\bhakt\\Downloads\\abcd (5).jpg")));
		
		
		l1=new Label("Topics");
		b1 = new Button("Cars");
		b2 = new Button("Biscuits");
		b3 = new Button("Laptop");
		b4 = new Button("Mobile");
		b5 = new Button("Best Prime minister");
		b6 = new Button("Best Movies");
		b7 = new Button("Best College");
		b8 = new Button("Top Programming Language");
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		
		b1.addActionListener(mf1);
		b2.addActionListener(mf1);
		b3.addActionListener(mf1);
		b4.addActionListener(mf1);
		b5.addActionListener(mf1);
		b6.addActionListener(mf1);
		b7.addActionListener(mf1);
		b8.addActionListener(mf1);
		
		
		
		l1.setBounds(500,100,200,100);
		b1.setBounds(100,250,250,50);
		b2.setBounds(100,400,250,50);
		b3.setBounds(100,600,250,50);
		b4.setBounds(100,800,250,50);
		b5.setBounds(600,250,350,50);
		b6.setBounds(600,400,250,50);
		b7.setBounds(600,600,250,50);
		b8.setBounds(600,800,450,50);
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		l1.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		b7.setFont(f1);
		b8.setFont(f1);
		
		
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
			MyFrame1 mf1 = new MyFrame1();
			mf1.setVisible(true);
			
	}
}