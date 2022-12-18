public class app{
    public static void main(String[] args){
        Conjunto c1 = new Conjunto(1, 2);
        Conjunto c2 = new Conjunto(2, 3);
        
        Data d1 = new Data(1, 1, 2022);
        Data d2 = new Data(10, 10, 2022);
        
        if(c1.maior(c2)){
            System.out.println("c1 é maior que c2"); 
        } else {
            System.out.println("c1 é menor que c2"); 
        }

        if(d1.maior(d2)){
            System.out.println("d1 é maior que d2"); 
        } else {
            System.out.println("d1 é menor que d2"); 
        } 
    }
    
}