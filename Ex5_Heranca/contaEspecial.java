package Ex5_Heranca; 

public class contaEspecial extends conta{
    protected double limite; 
    protected double taxaManutencao; 

    public boolean sacar(double valor){
        if((this.limite + super.saldo) < valor){
            return false; 
        } else{
            super.saldo -= valor; 
            return true;  
        }
    }

    public void resumoExtrato(){
        System.out.println(super.nome+". Saldo:"+super.saldo);
        System.out.println("Limite: "+this.limite+" Valor da Taxa de Manutenção:"+this.taxaManutencao);
    }

    public void fazManutencao(){
        super.saldo -= taxaManutencao; 
    }
    
    public contaEspecial(int numero, double saldo, String nome, double limite, double taxaManutencao){
        super(numero, saldo, nome);
        this.limite = limite; 
        this.taxaManutencao = taxaManutencao;  
    }
}
