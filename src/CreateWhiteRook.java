import javax.swing.ImageIcon;


public class CreateWhiteRook implements Order{
    
     private CreateImageRook abcStock;

   public CreateWhiteRook(CreateImageRook abcStock){
      this.abcStock = abcStock;
   }

   public ImageIcon execute() {
       
       return abcStock.CreateWhite();
       //return new ImageIcon(getClass().getResource("chessImages/WhiteRook.gif"));
   }
   
}
