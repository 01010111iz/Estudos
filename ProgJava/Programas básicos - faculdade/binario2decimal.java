import javax.swing.*;
class bin2dec
{
    public static void main(String []args) 
    {
        String n;
        int indexStart, indexEnd, auth=1;
        double i, n1, res=0;

        n = JOptionPane.showInputDialog("Digite aqui um número binário: ");
        indexStart=n.length()-1; 
        indexEnd=n.length();
        for (i=0; i < n.length(); i++)
        {
            n1=Double.parseDouble(n.substring(indexStart, indexEnd));
            if (n1 != 1 && n1 != 0)
            {
                auth = 0;
                break;
            }
            res = res + (Math.pow(2, i)*n1);
            //System.out.println(n1)
            if(indexEnd>0)
            {
                indexEnd--;
            }
            if(indexStart>0)
            {
                indexStart--;
            }
           
        }
        if (auth==1)
        {
            JOptionPane.showMessageDialog(null, "O número decimal é: " + res);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número digitado não é binário.");
        }
        System.exit(0);
    }
}