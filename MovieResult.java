import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MovieResult extends JFrame
{
	TextField t1,t2,t3,t4,t5,t6;
	Button l1,l2,l3,l4,l5,b1;
	MyActionListener mvr = new MyActionListener(this);
	MovieResult()
	{
		super("java project");
		setLayout(null);
		setBounds(0,0,1000,1000);
		setContentPane(new JLabel(new ImageIcon("E:\\Java Project\\images\\movie2.jpg")));
		setBackground(Color.pink);
		
		t1 = new TextField("Result");
		l1 = new Button("Jab we meet");
		l2 = new Button("Shiddat");
		l3 = new Button("Om Shanti Om");
		l4 = new Button("Jaane Tu Ya Jaane na");
		l5 = new Button("Bhool Bhulaiya");
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		t6 = new TextField();
		b1 = new Button("Back");
		
		add(t1);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(b1);
		
		t1.setBounds(100,100,300,100);
		l1.setBounds(100,300,200,50);
		l2.setBounds(100,400,200,50);
		l3.setBounds(100,500,200,50);
		l4.setBounds(100,600,200,50);
		l5.setBounds(100,700,200,50);
		t2.setBounds(400,300,50,50);
		t3.setBounds(400,400,50,50);
		t4.setBounds(400,500,50,50);
		t5.setBounds(400,600,50,50);
		t6.setBounds(400,700,50,50);
		b1.setBounds(100,800,100,50);
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		Font f2 = new Font("Arial",Font.BOLD,20);
		t1.setFont(f1);
		l1.setFont(f2);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		t2.setFont(f2);
		t3.setFont(f2);
		t4.setFont(f2);
		t5.setFont(f2);
		t6.setFont(f2);
		b1.setFont(f2);
		
		b1.addActionListener(mvr);
		
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
			MovieResult mvr = new MovieResult();
			mvr.setVisible(true);
			
	}
}