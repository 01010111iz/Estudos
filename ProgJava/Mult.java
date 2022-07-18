import javax.swing.*;
class Mult 
{
    public static void main(String entrada[]) 
    {
        int x, y, mult=(1);
        char op=(0);
        String msg = " ", msgEnter = "Digite 1 para calcular o produto.\nDigite 2 para calcular a produtória.\n";

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº inteiro aqui:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro nº inteiro aqui:"));
        op = (JOptionPane.showInputDialog(msgEnter).charAt(0));

        switch(op)
        {
            case'1':
            {
                if(x>0 & y>0)
                {
                    mult = x*y;
                    msg = msg + "Produto de " + x + " com " + y + " = " + mult + "\n";
                }
                break;
            }
            case'2':
            {
                for(int i=1; i<=y; i=i+1)
                {
                    mult=mult*x;
                }
                msg = msg + "Produtório de " + x + ", " + y + " vezes é: " + mult + "\n";
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");
        }

        if (op >= '1' & op <= '3')
        {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}