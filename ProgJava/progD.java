import javax.swing.*;
class progD
{
    public static void main(String entrance[])
    {
        int x;
        char op;
        String msg=" ", msgEnter = "Digite 1 para par/impar.\nDigite 2 para positivo/negativo.";

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um nº inteiro: "));
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);

        switch(op)
        {
            case '1':
            {
                if(x % 2==0)
                {
                    msg = msg + x + " é par.\n";
                }
            
                else
                {
                    msg = msg + x + " é impar.\n";
                }                             
                break;
            }
            case '2':
            {
                if(x>0)
                {
                    msg = msg + x + " é positivo.\n";
                }
                else
                {
                    msg = msg + x + " é negativo.\n";
                }
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opção inválida.");
        if (op == '1' | op == '2')
        {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
        }
    }
}