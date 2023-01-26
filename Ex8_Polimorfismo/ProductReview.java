public class ProductReview extends Post implements Evaluable{
    private String brand; 
    private Evaluable stars; 

    public void show(){
        super.show();
        System.out.println("Brand: "+this.brand+" Stars: "+this.stars);
    }

    public String getBrand(){
        return this.brand; 
    }

    public void setBrand(String brand){ 
        this.brand = brand; 
    }

    public Evaluable getEvaluation(){
        return this.stars; 
    }

    public void Evaluate(Evaluable stars){
        this.stars = stars; 
    } 
}
