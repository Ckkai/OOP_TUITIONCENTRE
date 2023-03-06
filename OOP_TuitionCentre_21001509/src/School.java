public class School {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String unit, String street, String city, String zipcode, String state) {
        this.address = new Address(unit, street, city, zipcode, state);
    }
}