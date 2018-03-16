//masyvai metoduose
public class pamoka26 {
	public static void main(String args[]){
	int mas[]= {2,5,8,5,8,9,4};
	pakeisti(mas);
	for(int x : mas)
		System.out.println(x);
	
		}
	public static void pakeisti(int tarpinis[]) {
		for (int i=0; i<tarpinis.length; i++)
			tarpinis[i]+=5;
		
	}
	
}
