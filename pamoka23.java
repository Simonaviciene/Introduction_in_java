
public class pamoka23 {
	public static void main(String args[]) {
		
		int mas[]= {1,2,2,1,2,1,2,2,3};
		int reiksme = mas[0];
		int k = 0;
		
		for(int i=0; i<mas.length;i++) {
			if (reiksme<mas[i]) {
				 reiksme = mas[i];
				 k = i;
				
			}
		
		}
		System.out.println(reiksme +" " +k);
		
	}
	
	

}
