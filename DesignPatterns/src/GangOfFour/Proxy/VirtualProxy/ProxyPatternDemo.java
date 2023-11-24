package GangOfFour.Proxy.VirtualProxy;

public class ProxyPatternDemo {
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg", "1234", 10) {
          public void display() {
              throw new UnsupportedOperationException("Not supported yet.");
          }
      };

      image.display("1234");
      System.out.println();
      image.display("wrong_code");
   }
}
