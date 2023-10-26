package GangOfFour.Decorator.FileDecorator;

public abstract class DataSourceDecorator implements DataSource {
    protected DataSource wrapper;

    public DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    public void writeData(String data) {
        wrapper.writeData(data);
    }

    public String readData() {
        return wrapper.readData();
    }

    public String readOriginalData() {
        return wrapper.readOriginalData();
    }
}
