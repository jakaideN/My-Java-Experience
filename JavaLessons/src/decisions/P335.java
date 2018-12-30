package decisions;

import java.util.Scanner;

public class P335 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the wavelength");
		
		double waveLength = s.nextDouble();
		
		if(waveLength > Math.pow(10, -1)) {
			System.out.println("Radio waves");
		}else if (waveLength > Math.pow(10, -3) && waveLength <= Math.pow(10, -1)){
			System.out.println("Microwaves");
		}else if (waveLength >7 *  Math.pow(10, -7) && waveLength <= Math.pow(10, -3)){
			System.out.println("Infrared");
		}else if (waveLength >4 * Math.pow(10, -7) && waveLength <= 7 * Math.pow(10, -7)){
			System.out.println("Visible light");
		}else if (waveLength > Math.pow(10, -8) && waveLength <= 4 *  Math.pow(10, -7)){
			System.out.println("Ultraviolet");
		}else if (waveLength > Math.pow(10, -11) && waveLength <= Math.pow(10, -8)){
			System.out.println("X-rays");
		}else if (waveLength < Math.pow(10, -11)){
			System.out.println("Gamma rays");
		}
		
		
		
}
}