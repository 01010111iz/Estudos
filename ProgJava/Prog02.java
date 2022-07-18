class Prog02
{
 	public static void main (String entrada[])
	{
		int x, y;
		int mod, div;
		double raiz, pot;
		String msg = " ";

		//entrada de dados
		x = Integer.parseInt(entrada[0]);
		y = Integer.parseInt(entrada[1]);

		//processamento		

		mod = x % y;
		//mod - quando a divisão é feita com "%" indica que o resto será 1, e não um número quebrado.

		div = (int)x / (int)y;
		//div - este é para números inteiros, não se faz a divisão destes números sendo um número real.

		raiz = Math.sqrt(x);
		//raiz - esta é para criar a raiz quadrada.

		pot = Math.pow(x, y);
		//pot - indica a potencia da fração.


		//saída de resultados.

		msg = "x = " + x + " y = " + y + "\n";
		//msg vai receber o x e y e vai concatenar todas as mensagens, uma atrás da outra.

		msg = msg + "resto da divisão de x por y = " + mod + "\n";

		//O "\n" é como se fosse o "escreval", joga os itens para a próxima linha.

		msg = msg + "quociente da divisao de x por y " + div + "\n";
		msg = msg + "raiz quadrada de x = " + raiz + "\n";
		msg = msg + "potencia de x e y = " + pot + "\n";
		System.out.println(msg);
		System.exit(0);
	}
}