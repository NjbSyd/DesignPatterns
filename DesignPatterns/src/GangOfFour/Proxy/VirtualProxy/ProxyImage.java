package GangOfFour.Proxy.VirtualProxy;

public abstract class ProxyImage implements Image {
   private RealImage realImage;
   private String fileName;
   private String code;
   private int fileSize;

   public ProxyImage(String fileName, String code, int fileSize) {
      this.fileName = fileName;
      this.code = code;
      this.fileSize = fileSize;
   }

   
   public void display(String displayCode) {
      if (realImage == null) {
         realImage = new RealImage(fileName, code);
      }
      System.out.println("File size: " + fileSize + "MB");
      realImage.display(displayCode);
   }
}
