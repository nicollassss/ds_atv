import java.util.Scanner;

public class BhaskaraF {

	public static void main(String[] args) {
		Scanner formula = new Scanner(System.in);
		System.out.print("A: ");
		double a = formula.nextDouble();
		
		System.out.print("B: ");
		double b = formula.nextDouble();
		
		System.out.print("C: ");
		double c = formula.nextDouble();
		
		
		double delta = b * b - 4 * a * c;
		if (a == 0) {
			System.out.println("nao é equação do 2 grau");
		} 
		else if (delta < 0) {
			System.out.println("negativo / sem raiz rea");
		}
		else { 
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("as raizes são:");
			System.out.println("x¹ = " + x1);
			System.out.println("x² = " + x2);
		}
		
		formula.close();

	}

}
