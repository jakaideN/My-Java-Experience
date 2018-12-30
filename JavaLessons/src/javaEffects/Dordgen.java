package javaEffects;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Dordgen {

		Rectangle r; 
		
		public Dordgen(int x, int y, int width, int height) {
			r = new Rectangle(x, y, width, height);
		}
		
		public void ekranaCiz(Graphics g)
		{
			g.drawRect((int) r.getX(),
					   (int) r.getY(),
					   (int) r.getWidth(),
					   (int) r.getHeight()
					   );
		}
		
		public void hareketEt(int x, int y) {
			r.setLocation((int)r.getX() + x,(int) r.getY() + y);
		}
	
}
