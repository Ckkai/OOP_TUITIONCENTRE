import java.awt.*;

public class Student {
    private Name name;
    private Address address;
    private School school;
    private float mark[]= new float[5];
    public Student(){}
    public Student(Name name, Address address,School school,float[] mark){
        this.name = name;
        this.address = address;
        this.school = school;
        this.mark = mark;
    }
    public float calcAVG(){
        float average = 0;
        float total = 0;
        for (int i=0;i<mark.length;i++){
            total +=mark[i];
        }
        average = total /5;

        return average;
    }
    public Name getName(){return name;}
    public void setName(String fname, String mname, String lname){
        Name name = new Name(fname, mname, lname);
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(String unit, String street, String city, String zipcode, String state){
        this.address = new Address(unit, street, city, zipcode, state);
    }
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public float getMarks(int i) {
        return mark[i];
    }

    public void setMarks(float mark, int i) {
        this.mark[i] = mark;
    }
}