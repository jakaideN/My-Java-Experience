package javaEffects;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class YeniPanel extends JPanel implements KeyListener{
	
	Dordgen a;
	Dordgen[] digerleri;
	int adim = 10;
	
	public YeniPanel() {
		super();
		addKeyListener(this);
		
		a = new Dordgen(300,200,20,20);
		digerleri = new Dordgen[10];
		digerleri[0] = new Dordgen(10, 10, 20, 20);
		digerleri[1] = new Dordgen(50, 40, 20, 20);
		digerleri[2] = new Dordgen(220, 30, 20, 20);
		digerleri[3] = new Dordgen(110, 210, 20, 20);
		digerleri[4] = new Dordgen(110, 110, 20, 20);
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		a.ekranaCiz(g);
		for (int i = 0; i < 5; i++) {
			digerleri[i].ekranaCiz(g);
		}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == e.VK_UP) {
			a.hareketEt(0, -adim);
			repaint();
		}
		else if(e.getKeyCode() == e.VK_DOWN){
			a.hareketEt(0, adim);
			repaint();
		}
		else if(e.getKeyCode() == e.VK_LEFT){
			a.hareketEt(-adim, 0);
			repaint();
		}
		else if(e.getKeyCode() == e.VK_RIGHT){
			a.hareketEt(adim, 0);
			repaint();
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
