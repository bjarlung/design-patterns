package Structural.Adapter;

public class EmployeeAdapter implements Employee {
    private EmployeeLdap instance;

    public EmployeeAdapter(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    //could be interpreted as a decorator bc changes something. But if in other class => OK
    public String toString() {
        return "Id: " + instance.getCn();
    }
}
