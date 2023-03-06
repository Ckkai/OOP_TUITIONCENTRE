public class Head {
    private Name name;

    public void setName(String fname,String mname,String lname) {
        name = new Name(fname, mname, lname);
    }
    public String getName(){
        String full = name.getFullname();
        return full;
    }
}