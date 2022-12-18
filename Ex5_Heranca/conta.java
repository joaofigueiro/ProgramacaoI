package Ex5_Heranca; 

public class conta{
    protected int numero; 
    protected double saldo; 
    protected String nome;    

    public conta(int numero, double saldo, String nome){
        this.numero = numero; 
        this.saldo = saldo; 
        this.nome = nome; 
    }

    public double depositar(double valor){
        return this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo < valor){
            return false; 
        }else{
            this.saldo -= valor; 
            return true;  
        }
    }

    public void resumoExtrato(){
        System.out.println(this.nome+' '+this.saldo);
    }

    public void fazManutencao(){
    }
}
