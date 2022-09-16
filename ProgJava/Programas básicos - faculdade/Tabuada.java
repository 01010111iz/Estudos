import javax.swing.*;
class Tabuada
{
    public static void main(String entrance[]) 
    {
        int tab;
        char op=0;
        String msg=" ", msgEnter="Digite 1 para repetição for.\nDigite 2 para repetição while.\nDigite 3 para repetição do/while.\n";
        
        tab = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        op = (JOptionPane.showInputDialog(msgEnter).charAt(0));

        switch (op)
        {
            case '1':
            {
                msg = msg + "Tabuada do " + tab + " pelo for: \n\n";
                for(int i=1; i<=10; i=i+1)
                {
                    msg = msg + tab + " x " + i + " = " + tab*i + "\n";
                }
                break;
            }
            case '2':
            {
                msg = msg + "Tabuada do " + tab + " pelo while: \n\n";
                int i = 1;
                while(i<=10)
                {
                    msg = msg + tab + " x " + i + " = " + tab*i + "\n";
                    i=i+1;
                }
                break;
            }
            case '3':
            {
                msg = msg + "Tabuada do " + tab + " pelo do/while: \n\n";
                int i=1;
                do
                {
                    msg = msg + tab + " x " + i + " = " + tab*i + "\n";
                    i=i+1;
                }
                while(i<=10);
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculo não realizado.");
        }
        if (op >= '1' & op <= '3')
        {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}