import java.util.Scanner;
class IMC
{
    /**
     * @param args
     */
    public static void main(String [] args) 
    {
        Scanner leitor = new Scanner(System.in);
        float n1, n2, form;

        System.out.println("Preencha abaixo os dados para cálculos do IMC: ");
        System.out.println("Digite aqui seu peso, em kg: ");
        n1=leitor.nextFloat;
        System.out.println("Digite aqui sua altura:");
        n2=leitor.nextFloat;
        form=n1*(n2.Math.pow(n2,2));
        System.out.println("Seu IMC é: " + form);
        if (form "19")
        {
            System.out.println("Subpeso, procure um médico.");
        }
        if (form >="20" & <="24.9")
        {
            System.out.println("IMC normal");
        }
        if(form > "25")
        {
            System.out.println("Sobrepeso, procure um médico.");
        }
    }
}