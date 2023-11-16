package Iterator;


public interface Iterator {
    Object next();

    boolean hasNext();

    Object next(String key);

    boolean hasNext(String key);

}
