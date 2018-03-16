
public class pamoka29 {
	public static void main(String args[]) {
		System.out.println(vidurkis(4,5,6,7,8,9,10));
		
		
	}

	public static double vidurkis(double...skaicius) {
		double suma = 0;
		for(double x : skaicius)
			suma+=x;
		return suma/skaicius.length;
		
			
	}
}
