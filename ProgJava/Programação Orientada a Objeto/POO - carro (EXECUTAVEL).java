class RodarApp
{
    public static void main (String[] args){
        Carro carro1 = new Carro();
/*1º contrutor, sem parâmetros */
        carro1.setcor("Azul");
        carro1.setmodelo("BMW série 3");
        carro1.setcapTanque(59);

        System.out.println(carro1.getmodelo());
        System.out.println(carro1.getcor());
        System.out.println(carro1.getcapTanque());
        System.out.println(carro1.valorTotal(6.39));
/*2º cosntrutor com parâmetros, definindo características do carro, explorando a sobrecarga */
        Carro carro2 = new Carro( "Vermelho",  "Mercedes Benz Classe C",  66);
        System.out.println(carro2.getmodelo());
        System.out.println(carro2.getcor());
        System.out.println(carro2.getcapTanque());
        System.out.println(carro2.valorTotal( 6.46));
    }
}