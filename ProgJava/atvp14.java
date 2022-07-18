import javax.swing.*;

class Atividade14
{
 	public static void main (String entrada[])
	{
		int x, y, mod;
		double pt1;
		String msg = " ";

	//entrada de dados
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui um número inteiro:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui outro número inteiro:"));

	//processamento		

		mod = (int)x / (int)y;
		pt1 = Math.pow(x, y);
	//raiz - esta é para criar a raiz quadrada.


	//saída de resultados.

		msg = msg + "Quociente da divisão de " + x + " por " + y + " = " + mod + "\n";
		msg = msg + "Potência de " + x + " e " + y + " = " + pt1 + "\n";
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	}
}