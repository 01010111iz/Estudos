import javax.swing.*;
class Somar
{

    /**
     * @param args
     */    public static void main (String args[])
    {
        int vet [], i, soma=0;
        vet = new int [100];

        for (i=0; i<=99; i++)
            vet[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
            soma = soma+vet [i];
            System.out.println("A soma dos 100 valores digitados é: " + soma);
            System.exit(0);
    }

}