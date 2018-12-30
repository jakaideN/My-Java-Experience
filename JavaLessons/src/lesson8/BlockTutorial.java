package lesson8;

public class BlockTutorial {
		
	
	
	
	static int i;
		public BlockTutorial() {
		
		System.out.println("Constructor");
}
	static
	{
		
		System.out.println("Static block run");
	
		int r = 5;
		
		i = (int) Math.sqrt(6*r);
}
	static{
		
		System.out.println("Instance initilizer run");
}
	{
		
		System.out.println("instance 1");
}
	{
		
		System.out.println("instance 2");
}
}
