import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
class Calculadora
{
    public static double soma(double a, double b) 
    {
        double soma = a + b, num;
        double calc = Double.parseDouble(JOptionPane.showInputDialog("Deseja somar mais um número?\n\n 1- Sim;\n 2- Não"));

        if(calc == 1)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            return (soma(soma, num));
        }
        else if(calc == 2)
        {
            return(soma);
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Opção inválida");
           return (0);
        }

    }
    public static double sub(double a, double b) 
    {
        double sub = a - b, num;
        double calc = Double.parseDouble(JOptionPane.showInputDialog("Deseja subtrair mais um número?\n\n 1- Sim;\n 2- Não"));
        
        if(calc == 1)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            return (sub(sub, num));
        }
        else if(calc == 2)
        {
            return(sub);
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Opção inválida");
           return (0);
        }
    }
    public static double mult (double a, double b) 
    {
        double mult = a * b, num;
        double calc = Double.parseDouble(JOptionPane.showInputDialog("Deseja multiplicar mais um número?\n\n 1- Sim\n 2-Não"));

        if(calc == 1)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            return (mult(mult, num));
        }
        else if(calc == 2)
        {
            return (mult);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            return (0);
        }

        
    }
    public static double div(double a, double b) 
    {
        double div , num;
        if(b != 0)
        {
            div = a/b;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O divisor não pode ser igual a 0");
            return (0);   
        }
        double calc = Double.parseDouble(JOptionPane.showInputDialog("Deseja dividir mais um número?\n\n 1- Sim\n 2-Não"));
        if(calc == 1)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            return (div(div, num));
        }
        else if(calc == 2)
        {
            return (div);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Opção inválida");
            return (0);   
        }
    } 
    public static double pot(double a, double b) 
    {
        double pot = a;
        for (int i=1; i<b; i++)
        {
            pot = pot*a;
        }
        return (pot);
    }
    public static double raiz(double a) 
    {
        double cont=0, raiz=0;

        while(true)
        {   
            if(cont>a)
            {
                JOptionPane.showMessageDialog(null, "O número não possui raiz inteira.");
                return(0);
            }
            raiz = cont*cont;
            if(raiz==a)
            {
                return(cont);
            }
            else
            {
                cont++;
            }
        }

    }
    public static void main(String args[]) 
    {

        char op=0;
        String msg = "", msgEnter = "Digite 1 para soma.\nDigite 2 para subtração.\nDigite 3 para multiplicação.\nDigite 4 para divisão.\nDigite 5 para potenciação.\nDigite 6 para raiz quadrada.";
        
        op = (JOptionPane.showInputDialog(msgEnter).charAt(0));
        switch(op)
        {
            case '1':
            {
                double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double soma=soma(n, n1);
                msg = msg + "O resultado da operação é: " + soma; 
            break;
            }
            
            case '2':
            {
                double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double sub=sub(n, n1);
                msg = msg + "O resultado da operação é: " + sub; 
                break;
            }

            case '3':
            {
                double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double mult=mult(n, n1);
                msg = msg + "O resultado da operação é: " + mult;
                break;
            }

            case '4':
            {
                double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double div=div(n, n1);
                msg = msg + "O resultado da operação é: " + div;
                break;
            }

            case '5':
            {
                double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double pot=pot(n, n1);
                msg = msg + "O resultado da operação é: " + pot;
                break;
            }

            case '6':
            {
                double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para operação: "));
                double raiz=raiz(n);
                msg = msg + "O resultado da operação é: " + raiz;
                break;
            }
            default: msg = msg + "Opção inválida.";
        }
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }

}