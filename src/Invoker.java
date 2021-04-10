import java.util.List;
import javax.swing.ImageIcon;


public class Invoker {
    
     private Order order;
    

   public Invoker(Order order){
  
        this.order=order;
        
   }
   
    public ImageIcon placeOrders(){
  
       return order.execute();
   }
  
}
