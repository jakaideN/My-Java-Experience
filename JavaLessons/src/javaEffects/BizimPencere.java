package javaEffects;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;

public class BizimPencere extends JFrame implements MouseListener,
KeyListener{

	private Random rnd;
	
	private int x1 , x2 , y1, y2;
	
	private String yazi;
	
	public BizimPencere() {
		super();
		rnd = new Random();	
		addMouseListener(this);
		addKeyListener(this);
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		yazi = "Merhaba";
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
		g.drawString(yazi, x1, y1);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getButton() == e.BUTTON1) 
		{
			x1 = e.getX();
			y1 = e.getY();			
		}
		
		if (e.getButton() == e.BUTTON3) 
		{
			x2 = e.getX();
			y2 = e.getY();			
		}
		
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == e.VK_BACK_SPACE && yazi.length() > 0)
		{
			yazi = yazi.substring(0, yazi.length()-1);		
		}
		else
		{
			yazi = yazi + e.getKeyChar();
	
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
