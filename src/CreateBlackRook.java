import javax.swing.ImageIcon;


public class CreateBlackRook implements Order{
    
   private CreateImageRook abcStock;
 
   public CreateBlackRook(CreateImageRook abcStock){
       
      this.abcStock = abcStock;
   }

   public ImageIcon execute() {
       
      return abcStock.CreateBlack();
 
   }
    
}
