import javax.swing.*;
class showMessageDialog
{
 public static void main (String entrance[]) 
 {
    int x, y, soma=0;
    char op=0;
    String msg=" ", msgEnter="Digite 1 para adição\nDigite 2 para somatória.\n";

    x=Integer.parseInt(JOptionPane.showInputDialog("Digite um nº inteiro:"));
    y=Integer.parseInt(JOptionPane.showInputDialog("Digite outro nº inteiro:"));
    op=(JOptionPane.showInputDialog(msgEnter).charAt(0));

    switch(op)
    {
        case '1':
        {
            if (x%2==0 & y%2==0)
            {
                soma = x+y;
                msg = msg + "Soma de " + x + " por " + y + " = " + soma + "\n";
            }
            break;
        }
        case '2':
        {
            for(int i=1; i<=y; i=i+1)
            {
                soma = soma + x;
            }
            msg = msg + "Somatória do " + x + ", " + y + " vezes é: " + soma + ".\n\n";
            break;
        }
        default: JOptionPane.showMessageDialog(null, "Opção inválida. Cálculo não realizado.");
    }

    if (op >= '1' & op <= '3')
    {
        JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
 }   
}