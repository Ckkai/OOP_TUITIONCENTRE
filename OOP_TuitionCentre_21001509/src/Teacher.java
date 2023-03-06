public class Teacher {
    private Name name;
    private Address address;
    private String quali;
    private int num;//variable to know how many year of experience in teaching

    public Name getName() {return name;}

    public void setName(String fname, String mname, String lname) {
        this.name = new Name(fname, mname, lname);
    }

    public Address getAddress() {return address;}

    public void setAddress(String unit, String street, String city, String zipcode, String state) {
        this.address = new Address(unit, street, city, zipcode, state);
    }
    public String getQuali() {return quali;}

    public void setQuali(String quali) {this.quali = quali;}

    public int getNum() {return num;}

    public void setNum(int num) {this.num = num;}
}