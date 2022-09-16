import javax.swing.*;
class exemploPilha{
    public static void main(String [] args) {
        Pilha intPilha=new Pilha(5);
        int i;
        int entrada;
        for(i=1; i<=5; i++){
            entrada=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
            intPilha.Empilhar(entrada);
        }
        intPilha.MostrarPilha();
        System.exit(0);
    }
}
class Pilha{
    /*ao criar uma pilha é tem que definir o tipo de pilha que será, neste caso, uma pilha de
     * registro
     * tem que definir o tamanho, topo e vetor.*/
    int tamanho;
    int topo;
    int vetor [];
    /*criação do construtor da pilha (abaixo), ele é construído como objeto, pois tudo no Java é objeto. */
    Pilha(int tam){
        topo=-1;
        tamanho=tam;
        vetor=new int [tam];
    }
    public boolean PV(){
        if(topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean PC(){
        if(topo >= tamanho-1/*tamanho-1 indica que ele validará a última posição
        a fim de saber se está cheio.*/){
            return true;
        }
        else{
            return false;
        }
    }
    public void Empilhar(int elemento){
        if (! PC()){
            topo = topo+1;
            vetor[topo]=elemento;
        }
        else{
            System.out.println("Pilha cheia.");
        }
    }
    public int Desempilhar() {
        int desempilhado=0;
        if(PV()){
            System.out.println("Pilha vazia");
        }
        else{
            desempilhado=vetor[topo];
            topo = topo-1
        }
        return desempilhado;
    }
    public void ElementoTopo() {
        /*também poderia ser caracterizado como função de inteiro retornando o valor*/
        if(topo>=0){
            System.out.println("O elemento do topo é:"+vetor[topo]);
        }
        else{
            System.out.println("Pilha vazia");
        }
    }
    public void MostrarPilha(){
        int i;
        for(i=topo; i>=0; i--){
            System.out.println("Elemento "+vetor[i]+" posição "+i);
        }
    }
}
