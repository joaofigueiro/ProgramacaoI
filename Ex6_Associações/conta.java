import java.util.*;

abstract class conta {
    protected int numero; 
    protected double saldo; 
    cliente cliente;    
    protected List<movimentacao> movimentacao; 

    public conta(int numero, double saldo, String nome, String cpf){
        this.numero = numero; 
        this.saldo = saldo; 
        this.cliente.nome = nome;
        this.cliente.cpf = cpf;  
    }

    public double depositar(double valor){
        movimentacao mov = new movimentacao(); 
        mov.valor = valor; 
        mov.tipo = 'C';
        return this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo < valor){
            return false; 
        }else{
            this.saldo -= valor; 
            movimentacao mov = new movimentacao(); 
            mov.valor = valor; 
            mov.tipo = 'D';
            return true;  
        }
    }

    public void resumoExtrato(){
        System.out.println(this.cliente.nome+' '+this.saldo);
    }

    public void extrato(){

    }

    abstract public void fazManutencao();
}
