//create class
public class objDemo {
    public static void main(String[] args) {
        person ob =new person();
        ob.name="vidya";
        ob.Rollnumber=12;
        ob.city="Vapi";
        System.out.println(ob.name +ob.Rollnumber +ob.city);
    }
}
class  person{
    String name;
    int Rollnumber;

    String city;
}