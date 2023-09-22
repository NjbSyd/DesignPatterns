package FileDecorator;

public interface DataSource {
    void writeData(String data);

    String readData();

    String readOriginalData();
}
