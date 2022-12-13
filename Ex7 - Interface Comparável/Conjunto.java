public class Conjunto implements Comparavel{

    int elemento1; 
    int elemento2; 

    private Conjunto(int a, int b){
        this.elemento1 = a; 
        this.elemento2 = b; 
    }

    private int soma(){
        return this.elemento1 + this.elemento2; 
    }

    private String getElementos(){
        return this.elemento1 + this.elemento2; 
    }

    public boolean igual(Comparavel obj){
        Conjunto cj = (Conjunto) obj; 

        if(cj)
    }
}