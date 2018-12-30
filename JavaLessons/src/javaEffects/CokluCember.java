package javaEffects;

import java.awt.Graphics;

public class CokluCember {

	int x, y;
	
	int genVeyuk;
	
	public CokluCember(int x, int y, int genVeyuk) {
		super();
		this.x = x;
		this.y = y;
		this.genVeyuk = genVeyuk;
		
	}



	public void ekranaCiz(Graphics g)
	{
		g.drawOval(x, y, genVeyuk, genVeyuk);
	}
	
	public void genisle(int i)
	{
		
		x -=i/2;
		y -=i/2;
		
		
		genVeyuk = genVeyuk + i;
	}
	
}
