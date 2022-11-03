import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
public class MyActionListener implements ItemListener, ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	CarFrame mf2;
	BiscuitFrame mf3;
	MobileFrame mf4;
	LaptopFrame mf5;
	PmFrame mf6;
	MovieFrame mf7;
	CollageFrame mf8;
	TplFrame mf9;
	CarResult cr;
	BiscuitResult br;
	MobileResult mr;
	LaptopResult lr;
	PmResult pr;
	MovieResult mvr;
	CollageResult cor;
	TplResult tr;
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}
	
	MyActionListener(MyFrame1 m)
	{
		this.mf1 = m;
	}
	ArrayList<String> al;
	MyActionListener(CarFrame m)
	{
		this.mf2 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(BiscuitFrame m)
	{
		this.mf3 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(MobileFrame m)
	{
		this.mf4 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(LaptopFrame m)
	{
		this.mf5 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(PmFrame m)
	{
		this.mf6 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(MovieFrame m)
	{
		this.mf7 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(CollageFrame m)
	{
		this.mf8 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(TplFrame m)
	{
		this.mf9 = m;
		al = new ArrayList<String>();
	}
	
	MyActionListener(CarResult m)
	{
		this.cr = m;
	}
	
	MyActionListener(BiscuitResult m)
	{
		this.br = m;
	}
	MyActionListener(MobileResult m)
	{
		this.mr = m;
	}
	MyActionListener(LaptopResult m)
	{
		this.lr = m;
	}
	MyActionListener(PmResult m)
	{
		this.pr = m;
	}
	MyActionListener(MovieResult m)
	{
		this.mvr = m;
	}
	MyActionListener(CollageResult m)
	{
		this.cor = m;
	}
	MyActionListener(TplResult m)
	{
		this.tr = m;
	}
	public void itemStateChanged(ItemEvent ae)
	{
		try{
			if(ae.getStateChange()==1)
			{
				CarFrame mf2 = new CarFrame();
				System.out.println(ae.getItem());
				FileWriter fw = new FileWriter("Survey.txt",true);
				fw.write(ae.getItem().toString()+",");
				fw.close();
			}
		}
		catch(Exception e)
		{
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Next"))
		{
			mf1 = new MyFrame1();
			this.mf1.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Cars"))
		{
			mf2 = new CarFrame();
			this.mf2.setVisible(true);
			this.mf1.setVisible(false);
		}
		if(e.getActionCommand().equals("Biscuits"))
		{
			mf3 = new BiscuitFrame();
			this.mf3.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Mobile"))
		{
			mf4 = new MobileFrame();
			this.mf4.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Laptop"))
		{
			mf5 = new LaptopFrame();
			this.mf5.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Best Prime minister"))
		{
			mf6 = new PmFrame();
			this.mf6.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Best Movies"))
		{
			mf7 = new MovieFrame();
			this.mf7.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Best College"))
		{
			mf8 = new CollageFrame();
			this.mf8.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Top Programming Language"))
		{
			mf9 = new TplFrame();
			this.mf9.setVisible(true);
			this.mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Back"))
		{
			mf1 = new MyFrame1();
			this.mf1.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Result"))
		{
			cr = new CarResult();
			this.cr.setVisible(true);
			this.mf2.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result2"))
		{
			br = new BiscuitResult();
			this.br.setVisible(true);
			this.mf3.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result3"))
		{
			mr = new MobileResult();
			this.mr.setVisible(true);
			this.mf4.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result4"))
		{
			lr = new LaptopResult();
			this.lr.setVisible(true);
			this.mf5.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result5"))
		{
			pr = new PmResult();
			this.pr.setVisible(true);
			this.mf6.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result6"))
		{
			mvr = new MovieResult();
			this.mvr.setVisible(true);
			this.mf7.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result7"))
		{
			cor = new CollageResult();
			this.cor.setVisible(true);
			this.mf8.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Result8"))
		{
			tr = new TplResult();
			this.tr.setVisible(true);
			this.mf9.setVisible(false);
		}
	}	
}
