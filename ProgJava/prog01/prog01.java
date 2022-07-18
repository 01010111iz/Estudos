class prog01
{
	public static void main (String entrada[])
	{
		int x;
		double y, soma;
		char caracter;

		x = Integer.parseInt(entrada[0]);
		y = Double.parseDouble(entrada[1]);
		caracter = (entrada[2]).charAt(0);
		soma = (double)x + y;
		System.out.println((double)x + " + " + y + " = " + soma + 
		" sinal " + caracter);
		System.exit(0);

	}
}