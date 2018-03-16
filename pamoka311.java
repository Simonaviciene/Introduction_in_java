//toString metodas
public class pamoka311 {
	
	private int x;
	private int y;
	private int z;
	
	public pamoka311(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
		
		System.out.printf("Jusu ivesti skaiciai yra %s",this);
		
	}
	public String toString() {
		
		return String.format("%d , %d , %d", x, y, z);
	}

}
