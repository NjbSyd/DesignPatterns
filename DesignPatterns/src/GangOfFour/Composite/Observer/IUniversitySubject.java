package GangOfFour.Composite.Observer;

public interface IUniversitySubject {
    void registerObserver(IEmployeeObserver observer);

    void removeObserver(IEmployeeObserver observer);

    void notifyObservers(String change);
    void notifyObservers(String change,String... type);
}
