
public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;

    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setState(String  state){
        this.state=state;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setZip(int zip){
        this.zip=zip;
    }
    public void  setPhoneNumber(long phoneNumber){
        this.phoneNumber =phoneNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }
    Contacts(String f,String l,String a,String s,String c,int z,long p,String e) {
        this.firstName = f;
        this.lastName = l;
        this.address = a;
        this.city = c;
        this.zip = z;
        this.state = s;
        this.phoneNumber = p;
        this.email = e;
    }
    public String toString(){
        return("First name:"+this.firstName+"; LastName:"+this.lastName+";Address:"+this.address+";City: "+this.city+";zip:"+this.zip+";PhoneNumber:"+this.phoneNumber+";Email:"+this.email+"");

    }
}