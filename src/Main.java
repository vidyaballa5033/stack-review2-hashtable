import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Contacts c1= new Contacts("vidya","Balla","someplace","somewhere","whatever",52345,86396,"efdg");
        List<Contacts> Addressbook = new ArrayList<Contacts>();
        Addressbook.add(c1);
        System.out.println(Addressbook);

    }
    }
