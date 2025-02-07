import java.util.Scanner;

public class BhaskaraF {

	public static void main(String[] args) {
		Scanner formula = new Scanner(System.in);
		//abrir scanner formula
		System.out.print("A: ");
		double a = formula.nextDouble();
		
		System.out.print("B: ");
		double b = formula.nextDouble();
		
		System.out.print("C: ");
		double c = formula.nextDouble();
		//resumindo, Print a,b e c e converte os valores para double
		
		double delta = b * b - 4 * a * c;
		//realiza a formula
		if (a == 0) {
			System.out.println("nao é equação do 2 grau");
		} 
		else if (delta < 0) {
			System.out.println("negativo / sem raiz rea");
		}
			//condicional se delta for menor que zero ou se a for igual a zero
		else { 
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			//se a condicional for atendida corretamente x1 e x2 serao feitos
			
			System.out.println("as raizes são:");
			System.out.println("x¹ = " + x1);
			System.out.println("x² = " + x2);
			//print dos resultados
		}
		
		formula.close();
		//fechar scanner formula

	}

}
