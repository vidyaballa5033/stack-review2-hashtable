
public class demo1 {
    static void display(int a) {
        System.out.println("The value is" + a);
    }

    static void display(int a, int b) {
        System.out.println("The value is " + a + "" + b);
    }


    public static void main(String[] args) {
        display(1);
        display(1,2);
    }
}