import java.util.*; 

public class carteiraPrime{
    List<String> clientes = new ArrayList<String>(); 

    public void listar(){
        System.out.println(clientes);
    }

    public void adicionar(String cliente){
        clientes.add(cliente); 
    }
}
