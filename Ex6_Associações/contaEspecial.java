public class contaEspecial extends conta{
    protected double limite; 
    protected double taxaManutencao; 

    public boolean sacar(double valor){
        if((saldo+this.limite) < valor){
            return false; 
        } else{
            saldo -= valor; 
            return true;  
        }
    }

    public void resumoExtrato(){
        System.out.println(cliente.nome+". Saldo:"+saldo);
        System.out.println("Limite: "+limite+" Valor da Taxa de Manutenção:"+taxaManutencao);
    }

    public void fazManutencao(){
        saldo -= taxaManutencao; 
    }
    
    public contaEspecial(int numero, double saldo, String nome, String cpf, double limite, double taxaManutencao){
        super(numero, saldo, nome, cpf);
        this.limite = limite; 
        this.taxaManutencao = taxaManutencao;  
    }
}
