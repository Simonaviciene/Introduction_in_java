
public enum pamoka361 {
	
	pozemiuKarys("Skeletas",100,"24"),
	tigras("Gyvunas",1500,"54"),
	miestoSargyba("Zmogus",3241,"80");
	
	private String tipas;
	private int gyvybes;
	private String lygis;
	
	pamoka361(String aprasymas, int gyvybesTaskai, String level){
		tipas = aprasymas;
		gyvybes = gyvybesTaskai;
		lygis = level;
	}
	
	public String gautiTipa() {
		return tipas;
	}	
	
	public int gautiGyvybes() {
		return gyvybes;
		
	}
	
	public String gautiLygi() {
		return lygis;
		
	}
	
}
