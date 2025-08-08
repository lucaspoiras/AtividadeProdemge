
import java.util.ArrayList;

 public class Teste{
    public static void main(String[] args) {
        
    
    ArrayList<Items> lista = new ArrayList<>();
    //Codigo para adicionar um item
    lista.add(new Items("x", "Preto"));
    lista.add(new Items("y", "Branco"));

    for(Items item : lista){
        if(item.Cor.equalsIgnoreCase("Preto")){
            System.out.println(item.Nome);
        }
    }
 }
}