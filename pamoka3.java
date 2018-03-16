import java.util.Scanner;

public class pamoka3 {
	public static void main(String []args) {
		
		Scanner klaviatura = new Scanner(System.in);
		int num1, num2, ats;
		
		System.out.println("Iveskite pirmaji skaiciu" );
		num1 = klaviatura.nextInt();
		
		System.out.println("Iveskite antraji skaiciu");
		num2 = klaviatura.nextInt();
		
		ats = num1 + num2;
		System.out.println(ats);
		
		
	}

}
