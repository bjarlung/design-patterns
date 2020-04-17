package Structural.Adapter;

public class EmployeeDB implements Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String firstName, String lastname, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
