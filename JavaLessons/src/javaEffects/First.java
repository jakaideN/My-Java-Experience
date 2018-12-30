package javaEffects;

import javax.swing.JFrame;

public class First {

	public static void main(String[] args) {

		JFrame jframe = new JFrame("My First program");
		
//		BizimPencere pencere = new BizimPencere();
		
//		KarePencereKaymasi pencere2 = new KarePencereKaymasi();
		
		
		YeniPanel yenipanel = new YeniPanel();
		
		jframe.add(yenipanel);
		
		jframe.addKeyListener(yenipanel);
		
		jframe.setSize(1040, 800);
		
		jframe.setVisible(true);

	}

}
