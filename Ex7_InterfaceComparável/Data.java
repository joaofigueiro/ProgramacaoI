public class Data implements Comparavel{

    private int dia; 
    private int mes; 
    private int ano; 

    public String getData(){
        return Integer.toString(this.dia)+Integer.toString(this.mes)+Integer.toString(this.ano); 
    }

    public void setData(int d, int m, int a){
        this.dia = d; 
        this.mes = m;
        this.ano = a;        
    }

    public Data(int d, int m, int a){
        this.dia = d; 
        this.mes = m;
        this.ano = a;
    }

    public String getDataFormatada(){
        return Integer.toString(this.dia)+'/'+Integer.toString(this.mes)+'/'+Integer.toString(this.ano); 
    }

    public boolean igual (Comparavel obj){
        Data dt = (Data) obj; 
        if(this.dia == dt.dia && this.mes == dt.mes && this.ano == dt.ano) {
            return true;
        } else {
            return false; 
        }              
    }

    public boolean maior (Comparavel obj){
        Data dt = (Data) obj; 
        if(this.ano > dt.ano){
            return true;
        } else if(this.ano == dt.ano){
            if(this.mes > dt.mes){
                return true;
            } else if (this.mes == dt.mes){
                if(this.dia > dt.dia){
                    return true; 
                } else if(this.dia == dt.dia){
                    return false; 
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        } else {
            return false; 
        }            
    }

    public boolean menor (Comparavel obj){
        Data dt = (Data) obj; 
        if(this.ano < dt.ano){
            return true;
        } else if(this.ano == dt.ano){
            if(this.mes < dt.mes){
                return true;
            } else if (this.mes == dt.mes){
                if(this.dia < dt.dia){
                    return true; 
                } else if(this.dia == dt.dia){
                    return false; 
                } else {
                    return false; 
                }
            } else {
                return false; 
            }
        } else {
            return false; 
        }            
    }
    
}