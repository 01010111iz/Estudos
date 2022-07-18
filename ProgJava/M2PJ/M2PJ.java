class M2PJ
{
	//módulo principal com a entrada pela linha de comando
	public static void main (String entrada[])
	{
	//declaração de variáveis
		int x, y, soma;
		
		//entrada de dados
		x = Integer.parseInt(entrada[0]);
		y = Integer.parseInt(entrada[1]);
		soma = x + y;
		System.out.println(x + " + " + y + " = " + soma);
		System.exit(0);
	}
}