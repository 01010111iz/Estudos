class RodarAplicacao{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
//Selecionar a classe; criar a variável; instanciar o objeto
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
    //Acima são upcasts implícitos, selecionou o gerente, vendedor e faxineiro e os tornou em funcionários

        //Gerente gerente_ = new Funcionario();
        //Vendedor vendedor_ = (Vendedor) new Funcionario();
        //Acima um exemplo de Downcast explicito transformando o funcionário em vendedor
    }
}