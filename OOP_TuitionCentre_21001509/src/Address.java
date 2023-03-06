public class Address {
    private String unit;
    private String street;
    private String city;
    private String zipcode;
    private String state;

    public Address(String unit, String street, String city, String zipcode, String state) {
        this.unit = unit;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;

    }

    @Override
    public String toString() {
        return unit +", "+ street+", "+city+", "+zipcode+", "+state;
    }

    public String getUnit() {return unit;}

    public void setUnit(String unit) {this.unit = unit;}

    public String getStreet() {return street;}

    public void setStreet(String street) {this.street = street;}
    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getZipcode() {return zipcode;}

    public void setZipcode(String zipcode) {this.zipcode = zipcode;}

    public String getState() {return state;}

    public void setState(String state) {this.state = state;}
}