import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class movimentacao {
    String data;  
    double valor; 
    char tipo; 

    public movimentacao(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date datasis = new Date();
        this.data = dateFormat.format(datasis);
    }
}
