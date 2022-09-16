class rec{
    public static int soma1(int nr, int soma) {
        int n;
        if(nr==100){
            n=nr+soma;
        }
        else{
            n=soma1(nr+1, soma+nr);
        }
        return n;
    }
    public static void main(String[]args) {
        int soma=soma1(1,0);
        System.out.println("A soma dos cem primeiros números é:" + soma);
        System.exit(0);
    }    
}