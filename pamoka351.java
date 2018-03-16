//final kintamieji
public class pamoka351 {
	
	private int suma;
	private final int NUMERIS;
	
	public pamoka351(int x) {
		NUMERIS=x;
	}

	public void prideti() {
		
		suma+=NUMERIS;
		
		
	}
	
	public String toString() {
		return String.format("suma = %d" ,suma);
		
	}
}
