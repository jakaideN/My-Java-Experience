package javaEffects;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencereKaymasi extends JPanel implements 
ActionListener,
MouseListener,
KeyListener{

	int x,y;
	
	int yuk, gen;
	
	int artismiktari = 4;
	
	Timer zaman;
	

	CokluCember[] cemberler;
	int cemberMevcut = 0;
	int cemberMax = 3;
	int cemberEleman = 0;
	
	
	public KarePencereKaymasi() {
		super();
		x = 400;
		y = 400;
		addMouseListener(this);
		addKeyListener(this);
		yuk = 0;
		gen = 0;
		cemberler = new CokluCember[cemberMax];
	
		zaman = new Timer(50, this);
		
		zaman.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < cemberEleman; i++) {
			cemberler[i].ekranaCiz(g);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < cemberEleman; i++) {
			cemberler[i].genisle(artismiktari);
		}
		
		repaint();
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
			
		CokluCember yeniCember = new CokluCember(e.getX(),e.getY(), 0);
			
		cemberler[cemberMevcut] = yeniCember;
		cemberMevcut = (cemberMevcut+1) % cemberMax;
		if(cemberEleman < cemberMax)
		{
			cemberEleman += 1;
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		zaman.start();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		zaman.stop();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == e.VK_UP) {
			artismiktari+=20;
		}else if (e.getKeyCode() == e.VK_DOWN) {
			artismiktari-=20;
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
