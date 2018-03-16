2import java.util.Scanner;

public class pamoka16 {
	public static void main(String args[]) {
		Scanner klaviatura = new Scanner(System.in);
		int i = 0;
		int n;
		double suma = 0;
		double vidurkis;
		double tarpinis;
		
		System.out.println("iveskite kiek skaiciu noresite naudoti: ");
		n = klaviatura.nextInt();
		
		while(i<n) {
			System.out.println("iveskite skaiciu: ");
			tarpinis = klaviatura.nextDouble();
			//suma = suma + tarpinis;
			suma += tarpinis;
			i++;
			
			
			
		}
		vidurkis = suma / n;
		System.out.printf("ivestu skaiciu vidurkis yra %s", vidurkis );
		
		}

}
