package edu.swingexSecond;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class Sub extends JFrame implements MouseListener
{
	//Ctrl + Shift + 'o'
	Container con = null;
	FlowLayout fl = new FlowLayout();
	ImageIcon im = new ImageIcon("aa.gif");
	
	JButton jb0 = new JButton("String");
	JButton jb1 = new JButton(im);
	JButton jb2 = new JButton("Str & Icon", im);
	ImageIcon im1 = new ImageIcon("bb.gif");
	ImageIcon im2 = new ImageIcon("cc.gif");
	
	public Sub()
	{
		super("ImageIcon ������");
		init();
		start();
	}

	public void init()	//ȭ������� ���
	{
		con = this.getContentPane();
		con.setLayout(fl);
		//jb0.setEnabled(false);	//Ŭ���� �ȵǰ�
		jb0.setEnabled(true);	//Ŭ���� �ȴ�
		con.add(jb0);
		jb1.setMnemonic('a');	//ALT + 'a' ����Ű ����
		
		con.add(jb1);
		jb2.setRolloverIcon(im2);
		jb2.setMnemonic('b');	//ALT + 'b' ����Ű ����
		con.add(jb2);
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public void start()	//�̺�Ʈ�� Thread ó�� ���
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb2.addMouseListener(this);
		jb0.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == jb2)		
		{
			jb2.setPressedIcon(im1);
		} 
		else if(e.getSource() == jb0)
		{
			jb0.doClick(5000);	//5000ms == 5 Second(5��)
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class SwingExSecond1116 {

	public static void main(String[] args) {
		Sub ob = new Sub();

	}

}
