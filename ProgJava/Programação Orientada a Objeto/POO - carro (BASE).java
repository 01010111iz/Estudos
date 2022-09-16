class Carro{
    int capTanque;
    String cor, modelo;
//construtor é sempre usado abaixo dos atributos.
Carro(){

}
Carro(String cor, String modelo, int capTanque){
    this.cor=cor;
    this.modelo=modelo;
    this.capTanque=capTanque;
//this serve para diferenciar o que é aplicado ao objeto da variável. Diferenciar o atributo do objeto
}


//set é usado para colcar valor em um atributo. Método é "void", pois não retorna nada, já que a ideia é guadar o valor.
    void setcor (String cor){
        this.cor=cor;
    }
/*get é usado para retornar o valor atribuído em set, neste método, como ele retorna um valor, o método não pode ser void, leva-se o mesmo nome que foi atribuído no set
neste caso, a String*/
    String getcor(){
        return cor;
    }

    void setmodelo (String modelo){
        this.modelo=modelo;
    }
    String getmodelo(){
        return modelo;
    }

    void setcapTanque (int capTanque){
        this.capTanque=capTanque;
    }

    int getcapTanque(){
        return capTanque;
    }

    double valorTotal (double valorComb){
        return capTanque*valorComb;
    }
   
        
}