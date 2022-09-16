import javax.swing.*;
class temp
{
    public static void main(String[] args) 
    {
     double C, K, F, Re, Ra;
     C=2.73;
     
     K=C+273.15;
     F=C*1.8+32;
     Re=C*0.8;
     Ra=C*1.8+32+459.67;

    System.out.println("A temperatura medida em Kelvin é: " + K);
    System.out.println("A temperatura medida em graus Fahrenheit é: " + F);
    System.out.println("A temperatura medida em Réaumur é: " + Re);
    System.out.println("A temperatura medida em Rankine é: " + Ra);
    System.exit(0);

    }
}