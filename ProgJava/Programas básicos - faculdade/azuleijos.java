class azuleijos
{
    public static void main(String []args) 
    {
        double hp, lp, ha, la, qtd;
        
        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;
        qtd = (hp*lp)/(ha*la);

        System.out.println("A quantidade de azuleijos necessárias para cobrir a parede é de: " + qtd);
        System.exit(0);
    }
}