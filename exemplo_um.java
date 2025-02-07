package exemplo;
import javax.swing.JOptionPane; 

public class exemplo_um {
	public static void main(String[] args ) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		//integer é uma encapsula int para manipula-lo
		//parseint converte string pra int
		int d = dobro(a);
		//valor para o dobro
		JOptionPane.showMessageDialog(null, "O dobro de " + a + " é " + d);
		//mensagem do resultado
	}
	
	static int dobro(int n) {
		return n * 2;
		//retornar dobro como n * 2
	}
}

