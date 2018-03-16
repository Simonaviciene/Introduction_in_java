import java.util.Scanner;

public class pamoka11 {
	public static void main(String []args) {
		Scanner klaviatura = new Scanner (System.in);
		System.out.println("iveskite savo varda");
		String vardas = klaviatura.nextLine();
		pamoka111 objektas = new pamoka111();
		
		objektas.zinute(vardas);
		
		
	}

}
