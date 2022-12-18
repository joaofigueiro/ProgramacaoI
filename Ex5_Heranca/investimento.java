package Ex5_Heranca; 

public class investimento extends conta{
    protected double taxaRendimento; 

    public void resumoExtrato(){
        System.out.println(super.nome+". Saldo: "+super.saldo);
        System.out.println("Valor da Taxa de Rendimento:"+taxaRendimento);
    }

    public void fazManutencao(){
        super.saldo += super.saldo * (taxaRendimento / 100); 
    }

    public investimento(int numero, double saldo, String nome, double taxaRendimento){
        super(numero, saldo, nome); 
        this.taxaRendimento = taxaRendimento;  
    } 
}
