package GangOfFour.Proxy.Proxy;

public class ProxyPatternDemo {
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg", "1234", 10) {
         
          public void display() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };

      // Correct code, image will be loaded and displayed
      image.display("1234");
      System.out.println();

      // Incorrect code, image display will fail
      image.display("wrong_code");
   }
}
