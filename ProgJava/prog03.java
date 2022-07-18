import javax.swing.*;

class prog03
{
 	public static void main (String entrada[])
	{
		int x, y, mod;
		double r1, r2;
		String msg = " ";

	//entrada de dados
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui um número inteiro"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui outro número inteiro"));

	//processamento		

		mod = x % y;
	//mod - quando a divisão é feita com "%" indica que o resto será 1, e não um número quebrado.

		r1 = Math.sqrt(x);
		r2 = Math.sqrt(y);
	//raiz - esta é para criar a raiz quadrada.


	//saída de resultados.

		msg = msg + "resto da divisão de " + x + "por " + y + " = " + mod + "\n";
		msg = msg + "raiz quadrada de " + x + " = " + r1 + "\n";
		msg = msg + "raiz quadrada de " + y + " = " + r2 + "\n";
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	}
}