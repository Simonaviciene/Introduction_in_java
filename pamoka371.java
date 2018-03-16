
public enum pamoka371 {
	
	pozemiuKarys("Skeletas",100,"24"),
	tigras("Gyvunas",1500,"54"),
	miestoSargyba("Zmogus",3241,"80"),
	LaukoKarys("Zmogus",120,"28"),
	liutas("Gyvunas",2000,"38"),
	driezas("Gyvunas",3000,"65");
	
	
	
	
	
	private String tipas;
	private int gyvybes;
	private String lygis;
	
	pamoka371(String aprasymas, int gyvybesTaskai, String level){
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


