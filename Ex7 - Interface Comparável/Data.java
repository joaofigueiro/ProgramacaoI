public class Data implements Comparavel{

    int dia; 
    int mes; 
    int ano; 

    private Data(int d, int m, int a){
        this.dia = d; 
        this.mes = m;
        this.a = a;
    }

    private String getDataFormatada(){
        return this.dia+'/'+this.mes+'/'+this.ano; 
    }

    private boolean maior(Comparavel obj){
        
    }

    private boolean menor(Comparavel obj){

    } 

    private boolean igual(Comparavel obj){

    }
}