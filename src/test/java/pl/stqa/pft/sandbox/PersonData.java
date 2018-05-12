package pl.stqa.pft.sandbox;

public class PersonData {

    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String title;

    public PersonData(String firstName, String lastName, String title, String company, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

}
