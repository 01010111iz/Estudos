import javax.swing.*;
class FatP{
    /*criação da função, fat é o nome atribuído a ela e a declaração de variáveis vem logo
    após nos parênteses*/
    static int fat(int n){
       int f;
       //é o que será devolvido, a declaração desta variável consumirá memória a cada chamada recursiva.*/
        if(n==0){
            return 1;
        }
        else{
           f= n*fat(n-1);
            return f;
        }
    }
    public static void main(String []args) {
        int f, nr;
        nr=Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo de fatorial: "));
        if(nr<0){
            System.out.println("Valor inválido. O número precisa ser positivo e igual ou maior que zero.");
            System.exit(0);
        }
        else{
            f=fat(nr);
            System.out.println("O fatorial de "+nr+" é:"+f);
        }
        System.exit(0);
    }
}