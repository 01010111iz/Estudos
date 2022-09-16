import javax.swing.*;
class FatP{
    static void fatorP(int n, int x, int f){
        if(x==0 || x==1){
            System.out.println("O fatorial de "+n+" é: "+f);
        }
        else{
            fatorP(n, x-1, f*x);
        }
    }
    public static void main(String[]args) {
        int nr;

        nr=Integer.parseInt(JOptionPane.showInputDialog("Digite um número para realizar o cálculo fatorial: "));
        if(nr<0){
            System.out.println("Valor inválido para o cálculo, digite um número maior ou igual a zero.");
            System.exit(0);
        }
        else{
            fatorP(nr, nr, 1);
        }
        System.exit(0);
    }
}