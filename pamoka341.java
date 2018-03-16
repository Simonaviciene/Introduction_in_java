
public class pamoka341 {
	public String vardas;
	public String pavarde;
	public static int numeris=0;
	
	public pamoka341(String vard, String pav) {
		vardas = vard;
		pavarde = pav;
		numeris++;
		System.out.printf("%s %s sekmingai pridetas i kluba, jo numeris %d\n", vardas, pavarde, numeris);
		
	}
	public static void skaicius() {
		numeris=numeris+10;
		
	}
	

}


