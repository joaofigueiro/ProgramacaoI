public class investimento extends conta{
    protected double taxaRendimento; 

    public void resumoExtrato(){
        System.out.println(cliente.nome+". Saldo:"+saldo);
        System.out.println("Valor da Taxa de Rendimento:"+taxaRendimento);
    }

    public void fazManutencao(){
        saldo += saldo * (taxaRendimento / 100); 
    }

    public investimento(int numero, double saldo, String nome, String cpf, double taxaRendimento){
        super(numero, saldo, nome, cpf); 
        this.taxaRendimento = taxaRendimento;  
    } 
}
