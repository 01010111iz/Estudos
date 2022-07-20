import javax.swing.*;
import java.util.Scanner;
class IMC
{
    /**
     * @param args
     */
    public static void main(String [] args) 
    {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, form;
        String msg = "";
        String ms = "";
    

        msg = msg + "Preencha abaixo os dados para cálculos do IMC: "+"\n\n";
        n1 = Double.parseDouble(JOptionPane.showInputDialog(msg + "Digite aqui seu peso, em kg: "));
        //n1=leitor.nextDouble();
        n2 = Double.parseDouble(JOptionPane.showInputDialog(msg + "Digite aqui sua altura em metros:"));
        //n2=leitor.nextDouble();
        form=n1/(Math.pow(n2, 2));
            ms = ms + "Seu IMC é: " + form+"\n\n";
        if (form <= 19)
        {
            ms = ms + "Subpeso, procure um médico.";
        }
        if (form >=20 & form <=24.9)
        {
            ms = ms + "IMC normal";
        }
        if(form >= 25)
        {
            ms = ms + "Sobrepeso, procure um médico.";
        }
        JOptionPane.showMessageDialog(null, ms);
        System.exit(0);
    }
}
