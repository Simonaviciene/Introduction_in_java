//metodu perkrova
public class pamoka38 {
	
	public static void main(String args[]) {
		pamoka38 obj = new pamoka38();
		System.out.println(obj.suma(1, 2));
		System.out.println(obj.suma(1, 3));
		System.out.println(obj.suma(1, 2.5));
		System.out.println(obj.suma(1, 2.5, 2.1));
		System.out.println(obj.suma( "1", "2"));
		
		
	}
	  
	int suma(int a, int b) {
		return a + b;
	}
	int suma(int a, int b, int c) {
		return a+ b+ c;
		
	}
	double suma(int a, double b) {
		return a + b;
		
	}
	double suma(int a, double b, double c) {
		return a+ b+ c;
	}
	String suma(String a, String b) {
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int suma = x + y;
		return String.valueOf(suma);
		
	}
}
