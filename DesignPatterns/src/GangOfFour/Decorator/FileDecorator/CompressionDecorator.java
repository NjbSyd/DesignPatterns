//package FileDecorator;
//
//public class CompressionDecorator extends DataSourceDecorator {
//    public CompressionDecorator(DataSource source) {
//        super(source);
//    }
//
//    @Override
//    public void writeData(String data) {
//        // Simulated compression process
//        String compressedData = "Compressed(" + data + ")";
//        super.writeData(compressedData);
//    }
//
//    @Override
//    public String readData() {
//        String compressedData = super.readData();
//        // Simulated decompression process
//        return compressedData.substring(11, compressedData.length() - 1);
//    }
//
//    @Override
//    public String readOriginalData() {
//        return super.readOriginalData();
//    }
//}

package FileDecorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data){
        // Compress the data before writing it to the underlying DataSource.
        String compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        // Decompress the data after reading it from the underlying DataSource.
        String compressedData = super.readData();
        return decompress(compressedData);
    }

    @Override
    public String readOriginalData() {
        return super.readOriginalData();
    }

    private String compress(String data){
        try{
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Deflater deflater = new Deflater();
            deflater.setInput(data.getBytes());
            deflater.finish();
            byte[] buffer = new byte[1024];
            while (!deflater.finished()) {
                int count = deflater.deflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();
            return outputStream.toString();
        }catch (Exception e){
            e.printStackTrace();
            return data;
        }
    }

    private String decompress(String data){
        try{
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data.getBytes());
        Inflater inflater = new Inflater();
        inflater.setInput(inputStream.readAllBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (!inflater.finished()) {
            int count = inflater.inflate(buffer);
            outputStream.write(buffer, 0, count);
        }
        outputStream.close();
        return outputStream.toString();
        }catch (Exception e){
            e.printStackTrace();
            return data;
        }
    }
}
