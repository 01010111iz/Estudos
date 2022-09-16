import javax.swing.*;
class Somarmat
{
    public static void main(String []args) 
    {
        int l, c, soma=0, mat [][] = new int [10][12];

        for(l=0; l<9; l++)
        {
            for(c=0; c<11; c++)
            {
                mat[l][c]=Integer.parseInt(JOptionPane.showInputDialog("Digite aqui um número inteiro: "));
                soma = soma + mat [l][c];
            
            }    
        }
        System.out.println("A soma dos 120 valores digitados é: " + soma);
        System.exit(0);
    }
}