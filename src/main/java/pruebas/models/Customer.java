package pruebas.models;

public class Customer {

    private String firstName;
    private String lastName;
    private String zip;

    public Customer(String firstName, String lastName, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
    }

    public static Customer with(String firstName, String lastName, String zip) {
        return new Customer(firstName, lastName, zip);
    }

    public static Customer defaultCustomer() {
        return new Customer("Test", "User", "12345");
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getZip() { return zip; }
}

