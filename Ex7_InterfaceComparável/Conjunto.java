public class Conjunto implements Comparavel{

    private int elemento1; 
    private int elemento2; 
    
    /*public List getConjunto(){
        return this.Elementos; 
    }*/

    public void setConjunto(int a, int b){
        this.elemento1 = a; 
        this.elemento2 = b;
    }

    public Conjunto(int a, int b){
        this.elemento1 = a; 
        this.elemento2 = b; 
    }

    public int soma(){
        return this.elemento1 + this.elemento2; 
    }

    public String getElementos(){
        return Integer.toString(this.elemento1) + Integer.toString(this.elemento2); 
    }

    public boolean igual (Comparavel obj){
        Conjunto cj = (Conjunto) obj; 
        if(this.soma() == cj.soma()){
            return true;
        } else {
            return false; 
        }                  
    }

    public boolean maior (Comparavel obj){
        Conjunto cj = (Conjunto) obj; 
        if(this.soma() > cj.soma()){
            return true;
        } else {
            return false;
        }               
    }

    public boolean menor (Comparavel obj){
        Conjunto cj = (Conjunto) obj; 
        if(this.soma() < cj.soma()){
            return true;
        } else {
            return false;
        }              
    }
}