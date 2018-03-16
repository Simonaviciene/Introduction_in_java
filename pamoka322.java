
public class pamoka322 {
	
	private String vardas;
	private pamoka321 skaiciai;
	
	public pamoka322(String vard, pamoka321 num) {
		vardas = vard;
		skaiciai = num;
		
	}
	public String toString() {
		return String.format("Jusu vardas yra %s, Jusu ivesti skaiciai yra %s ", vardas, skaiciai);
		
		
	}

}
