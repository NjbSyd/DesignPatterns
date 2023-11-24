package GangOfFour.Prototype;

public class Square extends Shape {

   public Square(){
     type = "GangOfFour.Prototype.Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside GangOfFour.Prototype.Square::draw() method.");
   }
}