import javax.swing.*;
class vetor
{
    /**
     * @param args
     */
    public static void main(String [] args) 
    {
        int i, media, soma=0, vet [] = new int [50];

        for (i=0; i<49; i++)
        {
            vet[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro aqui: "));
            soma = soma + vet[i];
        }
        media = soma/50;
        System.out.println("A média dos 50 números digitados é: " + media);
        System.exit(0);
    }
}