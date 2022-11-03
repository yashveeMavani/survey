import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class PmFrame extends JFrame
{
	Checkbox rb1,rb2,rb3,rb4,rb5;
	TextField t1;
	CheckboxGroup cb;
	Button b1,b2;
	MyActionListener mf6 = new MyActionListener(this);
	PmFrame()
	{
		super("java project");
		setLayout(null);
		setBounds(0,0,1000,1000);
		setContentPane(new JLabel(new ImageIcon("E:\\Java Project\\images\\pm4.jpg")));
		setBackground(Color.pink);
		
		t1 = new TextField("which is best prime minister in india ??");
		cb = new CheckboxGroup();
		rb1 = new Checkbox("Narendra Modi",cb,false);
		rb2 = new Checkbox("Manmohan Sinh",cb,false);
		rb3 = new Checkbox("Atal bihari vajpai",cb,false);
		rb4 = new Checkbox("Indira gandhi",cb,false);
		rb5 = new Checkbox("Jawaharlal nehru",cb,false);
		b1 = new Button("Back");
		b2 = new Button("Result5");
		
		add(t1);
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		add(rb5);
		add(b1);
		add(b2);
		
		t1.setBounds(100,100,600,100);
		rb1.setBounds(100,300,200,50);
		rb2.setBounds(100,400,200,50);
		rb3.setBounds(100,500,200,50);
		rb4.setBounds(100,600,200,50);
		rb5.setBounds(100,700,200,50);
		b1.setBounds(100,800,100,50);
		b2.setBounds(300,800,100,50);
		
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		Font f2 = new Font("Arial",Font.BOLD,20);
		t1.setFont(f1);
		rb1.setFont(f2);
		rb2.setFont(f2);
		rb3.setFont(f2);
		rb4.setFont(f2);
		rb5.setFont(f2);
		b1.setFont(f2);
		b2.setFont(f2);
		rb1.addItemListener(mf6);
		rb2.addItemListener(mf6);
		rb3.addItemListener(mf6);
		rb4.addItemListener(mf6);
		rb5.addItemListener(mf6);
		
		
		b1.addActionListener(mf6);
		b2.addActionListener(mf6);
		
		
		
		
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
			PmFrame mf6 = new PmFrame();
			mf6.setVisible(true);
	
	}
}